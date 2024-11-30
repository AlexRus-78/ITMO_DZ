import java.util.Optional;

public final class UtilInput {




    public  static String getReqierdedStringFromUser (){
        Optional<String> inputString;

        while ((inputString =inputStringFromUser()).isEmpety;
        return  inputString.get();
    }
    public static Optional<String> inputStringFromUser(){
        String result = inputFromUser().trim;
        if (result.isEmpty()){
            System.out.println("Вы ввели пустую строку вы ЛОХ");
            return  Optional.empty();
        }
        return Optional.of(result);
    }
    public  static int getRequiredIntFromUser () {
//        Optional<Integer> inputInt;
//        while ((inputInt = getIntFromUser()).isEmpety()) {
//            return inputInt.get();
        Optional<Integer>inputInt =  getIntFromUser();
            if (inputInt.isEmpty()){

                getRequiredIntFromUser();
        }
            return

    }
    public static Optional<Integer> getIntFromUser(){
        System.out.println("Введите число: ");
        try {
            return Optional.of(Integer).parseInt(inputFromUser);

    }catch (NumberFormatException e){
            System.out.println("Вы ввели не чило");
            return Optional.empty();
        }

}













}

public void main() {
}




