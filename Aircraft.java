package Joaircraftwaketurbulence.aircraft;


import static java.lang.Integer.toOctalString;

public class Aircraft {

    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modeADecimal;

    public Aircraft(String model, WakeTurbulence wakeTurbulence, int modeADecimal)
    {

        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modeADecimal = modeADecimal;

    }



    public String getModel()
    {

        return model;
        
    }


    public int getModeADecimal()

    {

        return modeADecimal;

    }


    public String getModeAOctal()
    {


        ModeACode modeACode = new ModeACode();
        return modeACode.getOctal();


    }


    public WakeTurbulence getWakeTurbulence()
    {

        return wakeTurbulence;

    }


    //public String getModeAOctal() {

        //class ModeACode {
        private class ModeACode {
            private String octal;

            public ModeACode() {

                int decimalValue = modeADecimal;

                // Aircraft.this.modeADecimal;

                if (decimalValue < 0 || decimalValue > 777) {

                    this.octal = null;

                }


                String octalValue = toOctalString(decimalValue);


                //Append leading zeros

                if (octalValue.length() == 4) {

                    this.octal = octalValue;

                }


                if (octalValue.length() == 3) {

                    this.octal = "0" + octalValue;


                }


                if (octalValue.length() == 2) {

                    this.octal = "00" + octalValue;

                }


                if (octalValue.length() == 1) {

                    this.octal = "000" + octalValue;

                }


            }

            public String getOctal() {


                return octal;

            }


        }

        //ModeACode modeACode = new ModeACode();
        //return modeACode.getOctal();


    //}

}
