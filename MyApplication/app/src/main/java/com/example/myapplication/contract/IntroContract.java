package com.example.myapplication.contract;

public interface IntroContract {
    interface View {
        void setLoading(boolean isLoading);

        void toastMessage(String message);

        void showDialog(String title, String btnText, String message, DialogOnClickListener callback);

        void launchDeepLink(String deeplink);
    }

    interface Presenter {
        boolean initializeKeystore();
    }

    interface DialogOnClickListener {
        void dialogOnClick();
    }
}
