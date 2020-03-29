package com.magicfruits.ui.fragments.endGame.view;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.magicfruits.R;
import com.magicfruits.databinding.FragmentEndGameBinding;
import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BaseBindingFragment;
import com.magicfruits.ui.fragments.endGame.presenter.endGamePresenter;


public class EndGameFragment extends BaseBindingFragment<endGamePresenter, FragmentEndGameBinding> implements EndGameView {

    public static final String WIN = "win";
    public static final String POINTS = "points";

    private boolean winGame;
    private String points;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_end_game;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        winGame = getArguments().getBoolean(WIN);
        points = getArguments().getString(POINTS);

        binding.poinintsTextView.setText(getText(R.string.points) + points);

        if (!winGame) {
            binding.textView.setText("GAME OVER");
            binding.ConstraintLayout.setBackground(getActivity().getDrawable(R.drawable.begraund));
        }

        binding.buttonNewGame.setOnClickListener(v -> {
            presenter.newGame();
        });
        binding.buttonExit.setOnClickListener(v -> {
            exitGame();
        });


    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {
    }

    @Override
    public void newGame(MainActivityRouter mainActivityRouter) {
        mainActivityRouter.showGameFragment();

    }


    public void exitGame() {
        getActivity().finish();
    }
}