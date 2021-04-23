package hackerrank.tests.DevsTest1;

import java.util.Arrays;

public class PriceCheck {
    public static void main(String[] args) {
        String[] products = new String[]{
                "eggs",
                "milk",
                "cheese"
        };

        double[] productPrices = new double[] {
                2.89,
                3.29,
                5.79
        };

        String[] productsSold = new String[]{
                "eggs",
                "eggs",
                "cheese",
                "milk"
        };

        double[] soldPrices = new double[] {
                2.89,
                2.99,
                5.97,
                3.29
        };

        int incorrectSales = 0;

        for(int i = 0; i < productsSold.length; i++){
            int productPriceIndex = 0;
            for(int j = 0; j < products.length; j++){
                if(products[j].equals(productsSold[i])){
                    productPriceIndex = j;
                    break;
                }
            }
            if(soldPrices[i] != productPrices[productPriceIndex]){
                incorrectSales++;
            }
        }

        System.out.println(incorrectSales);
    }
}
