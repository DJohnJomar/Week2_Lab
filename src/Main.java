//A java program that calculates shipping cost based on the items' weight and method of shipping
//February 20, 2024 - February 20, 2024
//3CS-A || Dimaunahan, Meneses
public class Main{
    public static void main(String[] args) throws Exception {
        //Normal Packages instantiation
        Package package1 = new Package(15,'A');
        Package package2 = new Package(6,'T');
        Package package3 = new Package(20, 'M');
        System.out.println("Packages:\t\tWeight\tShipping Method\tShipping Cost");
        System.out.println("Package 1"+package1.display());
        System.out.println("Package 2"+package2.display());
        System.out.println("Package 3"+package3.display());

        //Insured pacakges instantiation
        InsuredPackage insuredPackage1 = new InsuredPackage(15,'T');
        InsuredPackage insuredPackage2 = new InsuredPackage(32,'A');
        InsuredPackage insuredPackage3 = new InsuredPackage(5,'M');
        System.out.println("Ins-Package 1"+insuredPackage1.display());
        System.out.println("Ins-Package 2"+insuredPackage2.display());
        System.out.println("Ins-Package 3"+insuredPackage3.display());

    }
}
