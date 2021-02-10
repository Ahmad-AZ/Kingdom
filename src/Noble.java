public class Noble  extends Inhabitant{




    @Override
    public int taxableIncome() {
        return super.taxableIncome();
    }

    @Override
    public int tax() {

        int TaxNobel = taxableIncome() / 10;

        if(TaxNobel < 20 ){
            TaxNobel = 20;
        }
        return TaxNobel;
    }
}
