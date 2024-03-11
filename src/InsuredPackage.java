public class InsuredPackage extends Package {

    //Insured Package constructor
    /*
     * Instantiates the super class (Package class), then computes the additional cost for the insurance
     */
    public InsuredPackage(int weight, char shippingMethod){
        super(weight,shippingMethod);
        super.setShippingCost(calculateInsuredCost(super.getShippingCost()));
    }

    //Calculates additional cost based on the calculated shipping cost before insurance
    public float calculateInsuredCost(float shippingCost){
        if(shippingCost >=0 && shippingCost<=1){
            shippingCost+=2.45;
        }else if(shippingCost >=1.01 && shippingCost <=3.00){
            shippingCost +=3.95;
        }else if(shippingCost >=3.01){
            shippingCost+=5.55;
        }
        return shippingCost;
    }
}
