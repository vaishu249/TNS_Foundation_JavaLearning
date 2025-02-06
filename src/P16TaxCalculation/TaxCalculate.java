package P16TaxCalculation;

public class TaxCalculate {
    public void calculateTax(Person P){
        if(P.getAge()>65 || P.getGender().equalsIgnoreCase("female")){
            P.setTax(0);
        }
        else{
            if(P.getIncome()<=200000){
                P.setTax(0);
            }
            else if(P.getIncome()>200000 && P.getIncome()<=500000){
                P.setTax((P.getIncome()-200000)*10/100);
            }
            else if(P.getIncome()>500000 && P.getIncome()<=800000){
                P.setTax((P.getIncome()-500000)*10/100 + 30000);
            }
            else{
                P.setTax((P.getIncome()-800000)*30/100 + 90000);
            }
        }
    }
}
