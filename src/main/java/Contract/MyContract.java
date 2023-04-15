package Contract;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

public interface MyContract {
        String getMyField();
        void setMyField(String myField);
        String processSomething(String something);
}


/*Interface MyContract
        String getMyField();
        void setMyField(String myField);
        String procesSomething (String something);

MyContractImpl
        String processSomething(String something) {
            return "İşleniyor: " + something +" " + myField + " ile";
        }

@Configuration
        @Value("${my-contract.myfield}")
        private String myField;
        @Bean
        MyContract myContract() {
            MyContract myContract = new MyContractImpl();
            myContract.setMyField(myField);
            return myContract;
        }

@Controller

        /source/contract
                return myContract.processSomething("Godoro");*/
