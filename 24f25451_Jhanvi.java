public class Jhanvi {

    public static void main(String[] args) {

        int sector = 1;
        int vacancies;

        switch(sector) {
            case 1:
                vacancies = 150;
                break;
            case 2:
                vacancies = 100;
                break;
            default:
                vacancies = 0;
        }

        if(vacancies > 120) {
            System.out.println("High Demand Sector");
        } else {
            System.out.println("Moderate Demand Sector");
        }
    }
}
