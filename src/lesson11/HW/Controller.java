package lesson11.HW;
import java.util.Arrays;
public class Controller{
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public  Room[] requestRooms(int price, int persons, String city, String hotel){
        Room[] findedRooms;
        int count = 0;
        for (API el : apis) {
            if (el != null)
                count += el.findRooms(price, persons, city, hotel).length;
        }
        findedRooms = new Room[count];
        count = 0;

        for (API el : apis) {
            if (el != null)
                for (Room room : el.findRooms(price, persons, city, hotel)) {
                    findedRooms[count].equals(room);//
                    count++;
                }
        }
        return findedRooms;
    }
    public  Room[] check(API api1, API api2){
        Room[] findedRooms = null;
        int count = 0;
        if (api1.equals(null) || api2.equals(null))
            return null;
        for (Room el1 : api1.getAll())
            for (Room el2 : api2.getAll())
                if (el1 != null && el2 != null)
                    if (el1.getPrice() == el2.getPrice() && el1.getPersons() == el2.getPersons() && el1.getHotelName() == el2.getHotelName() && el1.getCityName() == el2.getCityName())
                        count++;

        findedRooms = new Room[count];
        count = 0;

        for (Room el1 : api1.getAll())
            for (Room el2 : api2.getAll())
                if (el1 != null && el2 != null)
                    if (el1.getPrice() == el2.getPrice() && el1.getPersons() == el2.getPersons() && el1.getHotelName() == el2.getHotelName() && el1.getCityName() == el2.getCityName()) {
                        findedRooms[count] = el1;
                        count++;
                    }


        return findedRooms;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "apis=" + Arrays.toString(apis) +
                '}';
    }
}


