public class Serf extends Peasant{



    @Override
    public int taxableIncome() {

            int taxableIncome = income - 12;

            if (taxableIncome < 0 ) {
                taxableIncome = 0;
            }
            return taxableIncome;
        }

    }

