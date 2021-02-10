public  class  Inhabitant {

    protected int income;


    public int taxableIncome(){

        return income;
    }

    public int tax(){
        int r = (int) (taxableIncome() * (10.0/100.0));
        if ( r > 0) {
            return r;
        }
        return 1 ;
    }

    public void setIncome(int income) {
        if (income <0 )throw new IllegalArgumentException();
        this.income = income;
    }

}
