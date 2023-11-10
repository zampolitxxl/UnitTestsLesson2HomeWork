package seminars.second.hw;


import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import  static org.assertj.core.api.Assertions.*;

public class TestCars {

//- Проверить, что экземпляр объекта Car также является экземпляром транспортного
// средства (используя оператор instanceof).

        @Test
        public void isCarExtendsVehicleClass() {


            Car bmw = new Car("bmw", "x5", 2009);

            assertThat(bmw).isInstanceOf(Vehicle.class);
        }


    //- Проверить, что объект Car создается с 4-мя колесами.

    @Test
    public void numberOfWheelsInCar() {


        Car bmw = new Car("bmw", "x5", 2009);

        assertThat(bmw.getNumWheels()).isEqualTo(4);

    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами.

    @Test
    public void numberOfWheelsInMotorcycle() {


        Motorcycle harleyDavidson = new Motorcycle("Harley Davidson", "fire", 2022);

        assertThat(harleyDavidson.getNumWheels()).isEqualTo(2);

    }

    //Проверить, что объект Car развивает скорость 60 в
    // режиме тестового вождения (используя метод testDrive()).


    @Test
    public void testSpeedOfCar() {


        Car bmw = new Car("bmw", "x5", 2009);
        bmw.testDrive();
        assertThat(bmw.getSpeed()).isEqualTo(60);

    }

    //Проверить, что объект Motorcycle развивает скорость 75 в
    // режиме тестового вождения (используя метод testDrive()).

    @Test
    public void testSpeedOMotorcycle() {


        Motorcycle harleyDavidson = new Motorcycle("Harley Davidson", "fire", 2022);
        harleyDavidson.testDrive();
        assertThat(harleyDavidson.getSpeed()).isEqualTo(75);


        //- Проверить, что в режиме парковки
        // (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
        // машина останавливается (speed = 0).
    }

        @Test
        public void parkingSpeedOfCar() {


            Car bmw = new Car("bmw", "x5", 2009);
            bmw.testDrive();
            bmw.park();
            assertThat(bmw.getSpeed()).isEqualTo(0);

        }


        //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
    // эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

    @Test
    public void parkingSpeedOfMotorcycle() {


        Motorcycle harleyDavidson = new Motorcycle("Harley Davidson", "fire", 2022);
        harleyDavidson.testDrive();
        harleyDavidson.park();
        assertThat(harleyDavidson.getSpeed()).isEqualTo(0);

    }

    


    }





