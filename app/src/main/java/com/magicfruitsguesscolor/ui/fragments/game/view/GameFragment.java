package com.magicfruitsguesscolor.ui.fragments.game.view;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.magicfruitsguesscolor.R;
import com.magicfruitsguesscolor.databinding.FragmentGameBinding;
import com.magicfruitsguesscolor.routers.main.MainActivityRouter;
import com.magicfruitsguesscolor.ui.base.BaseBindingFragment;
import com.magicfruitsguesscolor.ui.fragments.game.presenter.GamePresenter;
import com.squareup.picasso.Picasso;

import static com.magicfruitsguesscolor.constants.Constants.MYLOG_TEG;


public class GameFragment extends BaseBindingFragment<GamePresenter, FragmentGameBinding> implements GameView {


    public static final int MILLIS_IN_FUTURE = 3000;
    private final ImageView[] buttonPres = new ImageView[1];
    private Animation animRotate = null;
    private int lifes = 5;
    private int points = 0;
    private CountDownTimer countDownTimerConfirmationImageView;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_game;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        animRotate = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);

        setLifesLeft(lifes);
        setPoints(points);

        forMatces(view);

        binding.buttonExit.setOnClickListener(v -> {
            getActivity().finish();
        });


        binding.buttonNewGame.setOnClickListener(v -> {
            presenter.newGame();
        });


    }

    private void forMatces(@NonNull View view) {
        ImageView button1 = getActivity().findViewById(R.id.button1);
        ImageView button2 = getActivity().findViewById(R.id.button2);
        ImageView button3 = getActivity().findViewById(R.id.button3);
        ImageView button4 = getActivity().findViewById(R.id.button4);
        ImageView button5 = getActivity().findViewById(R.id.button5);
        ImageView button6 = getActivity().findViewById(R.id.button6);
        ImageView button7 = getActivity().findViewById(R.id.button7);
        ImageView button8 = getActivity().findViewById(R.id.button8);
        ImageView button9 = getActivity().findViewById(R.id.button9);

        ImageView button10 = getActivity().findViewById(R.id.button10);
        ImageView button12 = getActivity().findViewById(R.id.button12);
        ImageView button13 = getActivity().findViewById(R.id.button13);
        ImageView button14 = getActivity().findViewById(R.id.button14);
        ImageView button15 = getActivity().findViewById(R.id.button15);
        ImageView button17 = getActivity().findViewById(R.id.button17);
        ImageView button18 = getActivity().findViewById(R.id.button18);
        ImageView button19 = getActivity().findViewById(R.id.button19);
        ImageView button20 = getActivity().findViewById(R.id.button20);
        ImageView button22 = getActivity().findViewById(R.id.button22);
        ImageView button24 = getActivity().findViewById(R.id.button24);


        button1.setOnClickListener(v -> {
            int buttonNmberForMatch = 1;

            doAfterClick(buttonNmberForMatch, button1, buttonPres, view, R.drawable.mantch_1);


        });

        button2.setOnClickListener(v -> {
            int buttonNmberForMatch = 2;

            doAfterClick(buttonNmberForMatch, button2, buttonPres, view, R.drawable.mantch_2);

        });

        button3.setOnClickListener(v -> {
            int buttonNmberForMatch = 3;

            doAfterClick(buttonNmberForMatch, button3, buttonPres, view, R.drawable.mantch_3);

        });
        button4.setOnClickListener(v -> {
            int buttonNmberForMatch = 4;

            doAfterClick(buttonNmberForMatch, button4, buttonPres, view, R.drawable.mantch_4);

        });
        button5.setOnClickListener(v -> {
            int buttonNmberForMatch = 5;

            doAfterClick(buttonNmberForMatch, button5, buttonPres, view, R.drawable.mantch_5);

        });
        button6.setOnClickListener(v -> {
            int buttonNmberForMatch = 5;

            doAfterClick(buttonNmberForMatch, button6, buttonPres, view, R.drawable.mantch_5);

        });
        button7.setOnClickListener(v -> {
            int buttonNmberForMatch = 4;

            doAfterClick(buttonNmberForMatch, button7, buttonPres, view, R.drawable.mantch_4);

        });
        button8.setOnClickListener(v -> {
            int buttonNmberForMatch = 3;

            doAfterClick(buttonNmberForMatch, button8, buttonPres, view, R.drawable.mantch_3);

        });
        button9.setOnClickListener(v -> {
            int buttonNmberForMatch = 2;

            doAfterClick(buttonNmberForMatch, button9, buttonPres, view, R.drawable.mantch_2);

        });
        button10.setOnClickListener(v -> {
            int buttonNmberForMatch = 1;

            doAfterClick(buttonNmberForMatch, button10, buttonPres, view, R.drawable.mantch_1);

        });
        button12.setOnClickListener(v -> {
            int buttonNmberForMatch = 7;

            doAfterClick(buttonNmberForMatch, button12, buttonPres, view, R.drawable.mantch_7);

        });
        button13.setOnClickListener(v -> {
            int buttonNmberForMatch = 8;

            doAfterClick(buttonNmberForMatch, button13, buttonPres, view, R.drawable.mantch_8);

        });
        button14.setOnClickListener(v -> {
            int buttonNmberForMatch = 9;

            doAfterClick(buttonNmberForMatch, button14, buttonPres, view, R.drawable.mantch_9);

        });
        button15.setOnClickListener(v -> {
            int buttonNmberForMatch = 10;

            doAfterClick(buttonNmberForMatch, button15, buttonPres, view, R.drawable.mantch_10);

        });

        button17.setOnClickListener(v -> {
            int buttonNmberForMatch = 7;

            doAfterClick(buttonNmberForMatch, button17, buttonPres, view, R.drawable.mantch_7);

        });
        button18.setOnClickListener(v -> {
            int buttonNmberForMatch = 8;

            doAfterClick(buttonNmberForMatch, button18, buttonPres, view, R.drawable.mantch_8);

        });
        button19.setOnClickListener(v -> {
            int buttonNmberForMatch = 9;

            doAfterClick(buttonNmberForMatch, button19, buttonPres, view, R.drawable.mantch_9);

        });
        button20.setOnClickListener(v -> {
            int buttonNmberForMatch = 10;

            doAfterClick(buttonNmberForMatch, button20, buttonPres, view, R.drawable.mantch_10);

        });
        button22.setOnClickListener(v -> {
            int buttonNmberForMatch = 12;

            doAfterClick(buttonNmberForMatch, button22, buttonPres, view, R.drawable.mantch_12);

        });

        button24.setOnClickListener(v -> {
            int buttonNmberForMatch = 12;

            doAfterClick(buttonNmberForMatch, button24, buttonPres, view, R.drawable.mantch_12);

        });
    }

    private void doAfterClick(int buttonNmberForMatch, ImageView buttonClick, ImageView[] safeButtonPres, View v, int drable) {
        loadImage(drable, buttonClick);

        buttonClick.startAnimation(animRotate);
        buttonClick.setClickable(false);
        cheakForNull(buttonClick);

        cheak(buttonNmberForMatch, buttonClick, safeButtonPres[0], drable);

    }

    protected void cheakForNull(ImageView buttonClick) {
        if (buttonPres[0] == null) {
            buttonPres[0] = buttonClick;
            Log.d(MYLOG_TEG, "cheakForNull =  " + buttonPres[0]);

        }
    }

    private void cheak(int buttonNmberForMatch, ImageView buttonLastClic, ImageView safeButtonPres, int drable) {
        int skirt = R.drawable.skirt;

        if (presenter.getNamber() != 0) {
            if (presenter.getNamber() == buttonNmberForMatch) {
                presenter.setNaber(0);


                safeButtonPres.setVisibility(View.GONE);
                this.buttonPres[0] = null;

                buttonLastClic.setVisibility(View.GONE);

                presenter.chakForMathes(true);
            } else if (presenter.getNamber() != buttonNmberForMatch && presenter.getNamber() != 0) {


                presenter.setNaber(0);
                // loadImage(skirt, safeButtonPres);

                boolean equals = safeButtonPres.equals(buttonLastClic);

                Log.d(MYLOG_TEG, "equals " + equals);


                if (!equals) {
                    loadImage(skirt, safeButtonPres);
                    this.buttonPres[0] = null;


                    countDownTimerConfirmationImageView = new CountDownTimer(MILLIS_IN_FUTURE, 1) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            loadImage(skirt, buttonLastClic);

                        }
                    }.start();


                } else if (equals) {
                    loadImage(skirt, safeButtonPres);
                }

                safeButtonPres.setClickable(true);
                buttonLastClic.setClickable(true);

                presenter.chakForMathes(false);
            }
        } else if (presenter.getNamber() >= 0) {
            presenter.setNaber(buttonNmberForMatch);
        }
    }


    @Override
    public void showMessage(String message) {


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


    @Override
    public void showEndGame(MainActivityRouter mainActivityRouter, boolean flag, int points) {

        mainActivityRouter.showWinFragment(flag, points);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void setPoints(int points) {
        binding.poinintsTextView.setText(getText(R.string.points) + String.valueOf(points));

    }

    @Override
    public void setLifesLeft(int lifes) {
        binding.livesTextView.setText(getText(R.string.lives) + String.valueOf(lifes));

    }

    @Override
    public void showGameFragment(MainActivityRouter mainActivityRouter) {
        Intent i = new Intent( getActivity() , this.getClass() );
        getActivity().finish();
        this.startActivity(i);
    }

    public void loadImage(int part, ImageView button) {
        Picasso.get().load(part).into(button);
    }
}