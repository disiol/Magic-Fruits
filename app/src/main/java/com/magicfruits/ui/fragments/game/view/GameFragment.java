package com.magicfruits.ui.fragments.game.view;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.magicfruits.R;
import com.magicfruits.databinding.FragmentGameBinding;
import com.magicfruits.routers.main.MainActivityRouter;
import com.magicfruits.ui.base.BaseBindingFragment;
import com.magicfruits.ui.fragments.game.presenter.GamePresenter;

import java.util.ArrayList;
import java.util.Random;

import static com.magicfruits.constants.Constants.MYLOG_TEG;


public class GameFragment extends BaseBindingFragment<GamePresenter, FragmentGameBinding> implements GameView {


    public static final int MILLIS_IN_FUTURE = 3000;
    private Animation animRotate = null;
    private ArrayList<Integer> cards = new ArrayList<>();

    private int points = 0;
    private int cardsCaunter = 52;
    private LinearLayout dilerCardsLinearLayout;
    private LinearLayout cardsLinearLayout;
    private int cardNumber;
    private Integer imageResource;
    private ImageView deackImageView;
    private Random random = new Random();
    private int mimDilerPoints = 17;
    private int dilerPoints;


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_game;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        animRotate = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);
        setPoints(points);
        setMimDilerPoints(points);
        addCardsToCards();
        dilerCardsLinearLayout = binding.dilersCards;
        cardsLinearLayout = binding.cardsLinearLayout;


        binding.buttonExit.setOnClickListener(v -> {
            getActivity().finish();
        });


        binding.buttonNewGame.setOnClickListener(v -> {
            presenter.newGame();
        });


        cardsLinearLayout = getView().findViewById(R.id.cards_LinearLayout);
        cardsCaunter = cards.size() - 1;

        deackImageView = binding.deackImageView;

        deackImageView.setOnClickListener(v -> {


            schowCards(random, deackImageView, cardsLinearLayout, "user");
        });

        binding.standTextView.setOnClickListener(v -> {
            mufeDiler();

        });

    }


    @Override
    public void mufeDiler() {
        presenter.safeUsrPoints();
        presenter.resetPoints();

        binding.standTextView.setClickable(false);
        deackImageView.setClickable(false);
        cards.clear();
        addCardsToCards();

        while (dilerPoints < mimDilerPoints) {

            if (cards.size() == 0) {
                addCardsToCards();
            }
            schowCards(random, deackImageView, dilerCardsLinearLayout, "diler");
        }
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    private void schowCards(Random random, ImageView deackImageView, LinearLayout layout, String flag) {
        if (cardsCaunter > 1) {
            cardNumber = random.nextInt(cardsCaunter);
        } else {
            cardNumber = 0;
            binding.deackImageView.setClickable(false);
        }

        Log.d(MYLOG_TEG, "cardNumber " + cardNumber);
        Log.d(MYLOG_TEG, "cardsCaunter " + cardsCaunter);

        ImageView imageView = new ImageView(getActivity());
        imageResource = cards.get(cardNumber);
        imageView.setImageResource(imageResource);
        cards.remove(cardNumber);
        cardsCaunter = cards.size() - 1;
        layout.addView(imageView);
        cardsCaunter--;

        presenter.setPointsAndCheakForWin(imageResource, deackImageView, flag, mimDilerPoints);
    }


    private void addCardsToCards() {
        cards.add(R.drawable.bub_2);
        cards.add(R.drawable.bub_3);
        cards.add(R.drawable.bub_4);
        cards.add(R.drawable.bub_5);
        cards.add(R.drawable.bub_6);
        cards.add(R.drawable.bub_7);
        cards.add(R.drawable.bub_8);
        cards.add(R.drawable.bub_9);
        cards.add(R.drawable.bub_10);
        cards.add(R.drawable.bub_a);
        cards.add(R.drawable.bub_j);
        cards.add(R.drawable.bub_k);
        cards.add(R.drawable.bub_q);
        cards.add(R.drawable.c_2);
        cards.add(R.drawable.c_3);
        cards.add(R.drawable.c_4);
        cards.add(R.drawable.c_5);
        cards.add(R.drawable.c_6);
        cards.add(R.drawable.c_7);
        cards.add(R.drawable.c_8);
        cards.add(R.drawable.c_9);
        cards.add(R.drawable.c_10);
        cards.add(R.drawable.c_j);
        cards.add(R.drawable.c_q);
        cards.add(R.drawable.c_k);
        cards.add(R.drawable.c_a);
        cards.add(R.drawable.k_2);
        cards.add(R.drawable.k_3);
        cards.add(R.drawable.k_4);
        cards.add(R.drawable.k_5);
        cards.add(R.drawable.k_6);
        cards.add(R.drawable.k_7);
        cards.add(R.drawable.k_8);
        cards.add(R.drawable.k_9);
        cards.add(R.drawable.k_10);
        cards.add(R.drawable.k_j);
        cards.add(R.drawable.k_q);
        cards.add(R.drawable.k_k);
        cards.add(R.drawable.k_a);
        cards.add(R.drawable.p_2);
        cards.add(R.drawable.p_3);
        cards.add(R.drawable.p_4);
        cards.add(R.drawable.p_5);
        cards.add(R.drawable.p_6);
        cards.add(R.drawable.p_7);
        cards.add(R.drawable.p_8);
        cards.add(R.drawable.p_9);
        cards.add(R.drawable.p_10);
        cards.add(R.drawable.p_j);
        cards.add(R.drawable.p_q);
        cards.add(R.drawable.p_k);
        cards.add(R.drawable.p_a);
    }


    @Override
    public void showProgress(ProgressBar progressBar) {

    }

    @Override
    public void hideProgress(ProgressBar progressBar) {

    }

    @Override
    public void showMessage(String message) {
        binding.standTextView.setClickable(false);
        deackImageView.setClickable(false);

        Log.d(MYLOG_TEG, "showMessage:  " + message);

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message)
                .setCancelable(false)
                .setNegativeButton("ОК",
                        (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }


    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {

    }


    @SuppressLint("SetTextI18n")
    @Override
    public void setPoints(int points) {
        binding.poinintsTextView.setText(getText(R.string.gamer_points) + String.valueOf(points));

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void setMimDilerPoints(int points) {

        dilerPoints = points;
        binding.dilerPointsTextView.setText(getText(R.string.diler_points) + String.valueOf(dilerPoints));

    }


    @Override
    public void showGameFragment(MainActivityRouter mainActivityRouter) {
        mainActivityRouter.showLogoFragment();
    }

}