import java.util.Arrays;

public class OverseasStudent extends Student {
    String homeCountry;
    String[] possibleCountries = {"Poland","Nigeria","France","Germany"};

    OverseasStudent(String name, String address, String email_address, int phone_number, Boolean enrolled,int stuNumber, String homeCountry
                    ){
        super(name,address,email_address,phone_number,enrolled,stuNumber);
        this.homeCountry = homeCountry;

        //Checks array String[] for possible value from String
        if(Arrays.asList(possibleCountries).contains(homeCountry)){
            this.homeCountry = homeCountry;
        }
        else
            {
            this.homeCountry = "Not in the list";
        }

    }

    public String getCountry(){
        return homeCountry;
    }

}
