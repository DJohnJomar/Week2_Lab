import java.text.DecimalFormat;

public class Package {
    private int weight;
    private char shippingMethod;
    private float shippingCost;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");//object of the DecimalFormat Class used to format to the decimal values

    //Package class constructor
    public Package(int weight, char shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        this.shippingCost = calculateCost(weight, shippingMethod);

    }

    //Getter
    public float getShippingCost() {
        return this.shippingCost;
    }
    //Setter
    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    //Calculates cost based on weight and shipping method
    public float calculateCost(float weight, char shippingMethod) {
        float shippingCost = 0.00f;
        switch (shippingMethod) {
            case 'A':
                if (weight >= 1 && weight <= 8) {
                    shippingCost = 2.00f;
                } else if (weight >= 9 && weight <= 16) {
                    shippingCost = 3.00f;
                } else if (weight >= 17) {
                    shippingCost = 4.50f;
                }
                break;
            case 'T':
                if (weight >= 1 && weight <= 8) {
                    shippingCost = 1.50f;
                } else if (weight >= 9 && weight <= 16) {
                    shippingCost = 2.35f;
                } else if (weight >= 17) {
                    shippingCost = 3.25f;
                }
                break;
            case 'M':
                if (weight >= 1 && weight <= 8) {
                    shippingCost = 0.5f;
                } else if (weight >= 9 && weight <= 16) {
                    shippingCost = 1.50f;
                } else if (weight >= 17) {
                    shippingCost = 2.15f;
                }
                break;
        }
        return shippingCost;
    }
    //Old display method (May be used later)
    // public String display(){
    // String string = "";
    // if(shippingMethod == 'A'){
    // string = "Weight: "+this.weight+" ounces\nShipping Method: Air\nShipping
    // Cost: "+format.format(shippingCost);
    // }else if(shippingMethod == 'T'){
    // string = "Weight: "+this.weight+" ounces\nShipping Method: Truck\nShipping
    // Cost: "+format.format(shippingCost);
    // }else if(shippingMethod == 'M'){
    // string = "Weight: "+this.weight+" ounces\nShipping Method: Mail\nShipping
    // Cost: "+format.format(shippingCost);
    // }
    // return string;
    // }

    //Displays the weight, shipping method, and shipping cost in a specific layout for readable display in console.
    public String display() {
        String string = "";
        if (shippingMethod == 'A') {
            string ="\t\t"+this.weight+"\tAir\t\t"+decimalFormat.format(shippingCost);
        } else if (shippingMethod == 'T') {
            string ="\t\t"+this.weight+"\tTruck\t\t"+decimalFormat.format(shippingCost);
        } else if (shippingMethod == 'M') {
            string ="\t\t"+this.weight+"\tMail\t\t"+decimalFormat.format(shippingCost);
        }
        return string;
    }
}
