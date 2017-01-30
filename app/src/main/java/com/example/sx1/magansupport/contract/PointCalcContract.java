package com.example.sx1.magansupport.contract;

/**
 * Created by sx3note on 2017/01/06.
 */

public interface PointCalcContract {


    interface View {
        /**
         * 親子表示
         * @param str
         */
        void setOyaKoTextView(String str);

        /**
         * はん数表示
         * @param str
         */
        void setHanTextView(String str);

        /**
         * あがり方符表示
         * @param str
         */
        void setAgariHuTextView(String str);

        /**
         * 待ち符表示
         * @param str
         */
        void setMatiHuTextView(String str); // TODO: Mati⇒Machi

        /**
         * 例外符表示
         * @param str
         */
        void setReigaiHuTextView(String str);

        /**
         * 組み合わせ符表示
         * @param str
         */
        void setKumiawaseHuTextView(String str);

        /**
         * 最終結果表示
         * @param str
         */
        void setResultTextView(String str);
    }

    interface UserActions {
        // 親・子
        void pushOyaButton();
        void pushKoButton();

        // 翻数
        void pushHan1Buttton();
        void pushHan2Buttton();
        void pushHan3Buttton();
        void pushHan4Buttton();

        // アガリ方
        void pushMenzenButton();
        void pushNakiariButton();
        void pushRonButton();
        void pushTsumoButton();

        // 待ち
        void pushRyanmenButton();
        void pushShaboButton();
        void pushKantyanButton();
        void pushPentyanButton(); // TODO: Pentyan⇒Penchan
        void pushTankiButton();

        // 例外
        void pushPinhuButton();
        void pushTitoiButton(); // TODO: Titoi⇒chytoi
        void pushHokaButton();

        // 組み合わせ
        void selectHeadSpinner(int num);
        void selectMentsu1Spinner(int num);
        void selectMentsu2Spinner(int num);
        void selectMentsu3Spinner(int num);
        void selectMentsu4Spinner(int num);
    }
}
