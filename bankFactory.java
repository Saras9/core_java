package abstractFactoryPattern;

public class bankFactory {
    public bankAccount getInstance(String str){
        if(str == "current"){
            return new current();
        }
        else if (str == "loan") {
            return new loan();
        }
        else
            return new saving();

    }
}
