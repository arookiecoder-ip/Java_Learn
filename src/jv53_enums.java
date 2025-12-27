public class jv53_enums {
    static void main() {
//        Enums = (Enumerations) A special kind of class that
//        represents a fixed set of constants.
//        They improve code readability and are easy to maintain.
//         More efficient with switchest when comparing Strings.


        Day day = Day.SUNDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());



        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("This is a weekday");
            case SATURDAY ,
                 SUNDAY  -> System.out.println("this is a weekend");
        }



    }
}
