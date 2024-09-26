package pl.pja.edu.s27619;

import pl.pja.edu.s27619.cars.*;
import pl.pja.edu.s27619.dispatcher.RailwayDispatcher;
import pl.pja.edu.s27619.locomotive.Locomotive;
import pl.pja.edu.s27619.map.RailwayNetwork;
import pl.pja.edu.s27619.trainSet.TrainSet;
import pl.pja.edu.s27619.trainSet.ConnectImpossible;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RailwayDispatcher dispatcher = new RailwayDispatcher();
        RailwayNetwork railwayNetwork = new RailwayNetwork();

        //first TrainSet
        Locomotive locomotive1 = new Locomotive("Bialystok", "Bialystok",
                "Warsaw");
        TrainSet trainSet1 = new TrainSet(locomotive1, dispatcher);
        RailroadCarForPassengers railroadCarForPassengers1 = new RailroadCarForPassengers();
        try {
            try {
                railroadCarForPassengers1.loadingPeople(79);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }
            trainSet1.connectRailroadCar(railroadCarForPassengers1);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials1 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials1.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet1.connectRailroadCar(railroadCarForLiquidAndToxicMaterials1);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials1 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials1.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet1.connectRailroadCar(railroadCarForToxicMaterials1);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant1 = new RailroadCarForRestaurant();
        try {
            try {
                railroadCarForRestaurant1.loadingRailroadCar(300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet1.connectRailroadCar(railroadCarForRestaurant1);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForBaggage railroadCarForBaggage1 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage1.loadingRailroadCar
                        (300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet1.connectRailroadCar(railroadCarForBaggage1);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet1);


        //second train set
        Locomotive locomotive2 = new Locomotive("Warsaw", "Gdansk", "Warsaw");
        TrainSet trainSet2 = new TrainSet(locomotive2, dispatcher);
        RailroadCarForMail railroadCarForMail2 = new RailroadCarForMail();
        try {

            try {
                railroadCarForMail2.loadingRailroadCar(500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet2.connectRailroadCar(railroadCarForMail2);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPostOffice railroadCarForPostOffice2 = new RailroadCarForPostOffice();
        try {

            try {
                railroadCarForPostOffice2.loadingRailroadCar(700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet2.connectRailroadCar(railroadCarForPostOffice2);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers2 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers2.loadingPeople(60);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet2.connectRailroadCar(railroadCarForPassengers2);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator2 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator2.loadingRailroadCar(500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet2.connectRailroadCar(railroadCarForRefrigerator2);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials2 = new RailroadCarForToxicMaterials();
        try {

            try {
                railroadCarForToxicMaterials2.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet2.connectRailroadCar(railroadCarForToxicMaterials2);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForGaseousMaterials railroadCarForGaseousMaterials2 = new RailroadCarForGaseousMaterials();
        try {

            try {
                railroadCarForGaseousMaterials2.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet2.connectRailroadCar(railroadCarForGaseousMaterials2);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet2);


        //third train set
        Locomotive locomotive3 = new Locomotive("Gdansk", "Warsaw", "Lodz");
        TrainSet trainSet3 = new TrainSet(locomotive3, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage3 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage3.loadingRailroadCar
                        (400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet3.connectRailroadCar(railroadCarForBaggage3);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers3 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers3.loadingPeople(70);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet3.connectRailroadCar(railroadCarForPassengers3);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant3 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant3.loadingRailroadCar(400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet3.connectRailroadCar(railroadCarForRestaurant3);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight3 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight3.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet3.connectRailroadCar(railroadCarForHeavyFreight3);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator3 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator3.loadingRailroadCar(500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet3.connectRailroadCar(railroadCarForRefrigerator3);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet3);


        //fourth train set
        Locomotive locomotive4 = new Locomotive("Poznan", "Lodz", "Lublin");
        TrainSet trainSet4 = new TrainSet(locomotive4, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage4 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage4.loadingRailroadCar
                        (800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForBaggage4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers4 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers4.loadingPeople(40);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForPassengers4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant4 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant4.loadingRailroadCar(800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForRestaurant4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight4 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight4.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForHeavyFreight4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator4 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator4.loadingRailroadCar(500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForRefrigerator4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials4 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials4.loadingRailroadCar
                        (800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForLiquidAndToxicMaterials4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials4 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials4.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForToxicMaterials4);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet4);


        //fifth train set
        Locomotive locomotive5 = new Locomotive("Lublin", "Lodz", "Kielce");
        TrainSet trainSet5 = new TrainSet(locomotive5, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage5 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage5.loadingRailroadCar
                        (500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet5.connectRailroadCar(railroadCarForBaggage5);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers5 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers5.loadingPeople(30);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet5.connectRailroadCar(railroadCarForPassengers5);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant5 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant5.loadingRailroadCar(200);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet5.connectRailroadCar(railroadCarForRestaurant5);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials5 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials5.loadingRailroadCar
                        (350);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet5.connectRailroadCar(railroadCarForLiquidAndToxicMaterials5);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials5 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials5.loadingRailroadCar
                        (900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet5.connectRailroadCar(railroadCarForToxicMaterials5);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet5);


        //sixth train set
        Locomotive locomotive6 = new Locomotive("Bialystok", "Lodz", "Poznan");
        TrainSet trainSet6 = new TrainSet(locomotive6, dispatcher);
        RailroadCarForPassengers railroadCarForPassengers6 = new RailroadCarForPassengers();
        try {
            try {
                railroadCarForPassengers6.loadingPeople(59);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }
            trainSet6.connectRailroadCar(railroadCarForPassengers6);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials6 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials6.loadingRailroadCar
                        (2000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet6.connectRailroadCar(railroadCarForLiquidAndToxicMaterials6);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials6 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials6.loadingRailroadCar
                        (1500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet6.connectRailroadCar(railroadCarForToxicMaterials6);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant6 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant6.loadingRailroadCar(300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet6.connectRailroadCar(railroadCarForRestaurant6);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForBaggage railroadCarForBaggage6 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage6.loadingRailroadCar
                        (500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet6.connectRailroadCar(railroadCarForBaggage6);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet6);


        //seventh train set
        Locomotive locomotive7 = new Locomotive("Krakow", "Kielce", "Rzeszow");
        TrainSet trainSet7 = new TrainSet(locomotive7, dispatcher);
        RailroadCarForPassengers railroadCarForPassengers7 = new RailroadCarForPassengers();
        try {
            try {
                railroadCarForPassengers7.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }
            trainSet7.connectRailroadCar(railroadCarForPassengers7);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials7 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials7.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet7.connectRailroadCar(railroadCarForLiquidAndToxicMaterials7);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials7 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials7.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet7.connectRailroadCar(railroadCarForToxicMaterials7);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant7 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant7.loadingRailroadCar(400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet7.connectRailroadCar(railroadCarForRestaurant7);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForBaggage railroadCarForBaggage7 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage7.loadingRailroadCar
                        (300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet7.connectRailroadCar(railroadCarForBaggage7);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet7);


        //eighth train set
        Locomotive locomotive8 = new Locomotive("Poznan", "Kielce", "Krakow");
        TrainSet trainSet8 = new TrainSet(locomotive8, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage8 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage8.loadingRailroadCar
                        (800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet8.connectRailroadCar(railroadCarForBaggage8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers8 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers8.loadingPeople(40);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet4.connectRailroadCar(railroadCarForPassengers8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant8 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant8.loadingRailroadCar(500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet8.connectRailroadCar(railroadCarForRestaurant8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight8 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight8.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet8.connectRailroadCar(railroadCarForHeavyFreight8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator8 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator8.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet8.connectRailroadCar(railroadCarForRefrigerator8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials8 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials8.loadingRailroadCar
                        (800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet8.connectRailroadCar(railroadCarForLiquidAndToxicMaterials8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials8 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials8.loadingRailroadCar
                        (950);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet8.connectRailroadCar(railroadCarForToxicMaterials8);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet8);


        //ninth train set
        Locomotive locomotive9 = new Locomotive("Paris", "Poznan", "Opole");
        TrainSet trainSet9 = new TrainSet(locomotive9, dispatcher);
        RailroadCarForPassengers railroadCarForPassengers9 = new RailroadCarForPassengers();
        try {
            try {
                railroadCarForPassengers9.loadingPeople(59);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }
            trainSet9.connectRailroadCar(railroadCarForPassengers9);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials9 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials9.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet9.connectRailroadCar(railroadCarForLiquidAndToxicMaterials9);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials9 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials9.loadingRailroadCar
                        (2300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet9.connectRailroadCar(railroadCarForToxicMaterials9);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant9 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant9.loadingRailroadCar(600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet9.connectRailroadCar(railroadCarForRestaurant9);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForBaggage railroadCarForBaggage9 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage9.loadingRailroadCar
                        (500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet9.connectRailroadCar(railroadCarForBaggage9);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet9);


        //tenth train set
        Locomotive locomotive10 = new Locomotive("Warsaw", "Poznan", "Wroclaw");
        TrainSet trainSet10 = new TrainSet(locomotive10, dispatcher);
        RailroadCarForMail railroadCarForMail10 = new RailroadCarForMail();
        try {

            try {
                railroadCarForMail10.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet10.connectRailroadCar(railroadCarForMail10);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPostOffice railroadCarForPostOffice10 = new RailroadCarForPostOffice();
        try {

            try {
                railroadCarForPostOffice10.loadingRailroadCar(705);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet10.connectRailroadCar(railroadCarForPostOffice10);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers10 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers10.loadingPeople(78);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet10.connectRailroadCar(railroadCarForPassengers10);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator10 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator10.loadingRailroadCar(789);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet10.connectRailroadCar(railroadCarForRefrigerator10);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials10 = new RailroadCarForToxicMaterials();
        try {

            try {
                railroadCarForToxicMaterials10.loadingRailroadCar
                        (900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet10.connectRailroadCar(railroadCarForToxicMaterials10);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForGaseousMaterials railroadCarForGaseousMaterials10 = new RailroadCarForGaseousMaterials();
        try {

            try {
                railroadCarForGaseousMaterials10.loadingRailroadCar
                        (500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet10.connectRailroadCar(railroadCarForGaseousMaterials10);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet10);


        //eleventh train set
        Locomotive locomotive11 = new Locomotive("Gdansk",
                "Grodno", "Bialystok");
        TrainSet trainSet11 = new TrainSet(locomotive11, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage11 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage11.loadingRailroadCar
                        (900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet11.connectRailroadCar(railroadCarForBaggage11);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers11 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers11.loadingPeople(40);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet11.connectRailroadCar(railroadCarForPassengers11);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant11 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant11.loadingRailroadCar(400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet11.connectRailroadCar(railroadCarForRestaurant11);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight11 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight11.loadingRailroadCar
                        (900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet11.connectRailroadCar(railroadCarForHeavyFreight11);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator11 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator11.loadingRailroadCar(800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet11.connectRailroadCar(railroadCarForRefrigerator11);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet11);


        //twelves train set
        Locomotive locomotive12 = new Locomotive("Poznan", "Litva", "Bialystok");
        TrainSet trainSet12 = new TrainSet(locomotive12, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage12 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage12.loadingRailroadCar
                        (1100);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForBaggage12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers12 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers12.loadingPeople(70);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForPassengers12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant12 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant12.loadingRailroadCar(600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForRestaurant12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight12 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight12.loadingRailroadCar
                        (900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForHeavyFreight12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator12 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator12.loadingRailroadCar(800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForRefrigerator12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials12 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials12.loadingRailroadCar
                        (890);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForLiquidAndToxicMaterials12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials12 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials12.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet12.connectRailroadCar(railroadCarForToxicMaterials12);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet12);


        //13 train set
        Locomotive locomotive13 = new Locomotive("Lublin", "Grodno", "Minsk");
        TrainSet trainSet13 = new TrainSet(locomotive13, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage13 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage13.loadingRailroadCar
                        (489);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet13.connectRailroadCar(railroadCarForBaggage13);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers13 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers13.loadingPeople(60);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet13.connectRailroadCar(railroadCarForPassengers13);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant13 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant13.loadingRailroadCar(700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet13.connectRailroadCar(railroadCarForRestaurant13);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials13 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials13.loadingRailroadCar
                        (250);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet13.connectRailroadCar(railroadCarForLiquidAndToxicMaterials13);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials13 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials13.loadingRailroadCar
                        (960);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet13.connectRailroadCar(railroadCarForToxicMaterials13);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet13);


        //14 train set
        Locomotive locomotive14 = new Locomotive("Bialystok", "Minsk",
                "Vitebsk");
        TrainSet trainSet14 = new TrainSet(locomotive14, dispatcher);
        RailroadCarForPassengers railroadCarForPassengers14 = new RailroadCarForPassengers();
        try {
            try {
                railroadCarForPassengers14.loadingPeople(59);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }
            trainSet14.connectRailroadCar(railroadCarForPassengers14);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials14 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials14.loadingRailroadCar
                        (2000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet14.connectRailroadCar(railroadCarForLiquidAndToxicMaterials14);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials14 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials14.loadingRailroadCar
                        (1500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());

            }

            trainSet14.connectRailroadCar(railroadCarForToxicMaterials14);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant14 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant14.loadingRailroadCar(300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet14.connectRailroadCar(railroadCarForRestaurant14);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForBaggage railroadCarForBaggage14 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage14.loadingRailroadCar
                        (800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet14.connectRailroadCar(railroadCarForBaggage14);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet14);


        //15 train set
        Locomotive locomotive15 = new Locomotive("Krakow", "Vitebsk", "Grodno");
        TrainSet trainSet15 = new TrainSet(locomotive15, dispatcher);
        RailroadCarForPassengers railroadCarForPassengers15 = new RailroadCarForPassengers();
        try {
            try {
                railroadCarForPassengers15.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }
            trainSet15.connectRailroadCar(railroadCarForPassengers15);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials15 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials15.loadingRailroadCar
                        (1000);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet15.connectRailroadCar(railroadCarForLiquidAndToxicMaterials15);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials15 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials15.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet15.connectRailroadCar(railroadCarForToxicMaterials15);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant15 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant15.loadingRailroadCar(400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet15.connectRailroadCar(railroadCarForRestaurant15);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForBaggage railroadCarForBaggage15 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage15.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet15.connectRailroadCar(railroadCarForBaggage15);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet15);


        //16 train set
        Locomotive locomotive16 = new Locomotive("Poznan", "Grodno", "Brest");
        TrainSet trainSet16 = new TrainSet(locomotive16, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage16 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage16.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForBaggage16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers16 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers16.loadingPeople(30);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForPassengers16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant16 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant16.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForRestaurant16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight16 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight16.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForHeavyFreight16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator16 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator16.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForRefrigerator16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials16 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials16.loadingRailroadCar
                        (800);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForLiquidAndToxicMaterials16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials16 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials16.loadingRailroadCar
                        (900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet16.connectRailroadCar(railroadCarForToxicMaterials16);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet16);

        //17 train set
        Locomotive locomotive17 = new Locomotive("Poznan", "Minsk", "Brest");
        TrainSet trainSet17 = new TrainSet(locomotive17, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage17 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage17.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForBaggage17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers17 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers17.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForPassengers17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant17 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant17.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForRestaurant17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight17 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight17.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForHeavyFreight17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator17 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator17.loadingRailroadCar(560);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForRefrigerator17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials17 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials17.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForLiquidAndToxicMaterials17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials17 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials17.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet17.connectRailroadCar(railroadCarForToxicMaterials17);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet17);


        //18 train set
        Locomotive locomotive18 = new Locomotive("Poznan", "Brest", "Gomel");
        TrainSet trainSet18 = new TrainSet(locomotive18, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage18 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage18.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForBaggage18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers18 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers18.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForPassengers18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant18 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant18.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForRestaurant18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight18 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight18.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForHeavyFreight18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator18 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator18.loadingRailroadCar(560);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForRefrigerator18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials18 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials18.loadingRailroadCar
                        (700);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForLiquidAndToxicMaterials18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials18 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials18.loadingRailroadCar
                        (500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet18.connectRailroadCar(railroadCarForToxicMaterials18);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet18);

        //19 train set
        Locomotive locomotive19 = new Locomotive("Poznan", "Gomel", "Minsk");
        TrainSet trainSet19 = new TrainSet(locomotive19, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage19 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage19.loadingRailroadCar
                        (500);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForBaggage19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers19 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers19.loadingPeople(10);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForPassengers19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant19 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant19.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForRestaurant19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight19 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight19.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForHeavyFreight19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator19 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator19.loadingRailroadCar(560);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForRefrigerator19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials19 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials19.loadingRailroadCar
                        (980);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForLiquidAndToxicMaterials19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials19 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials19.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet19.connectRailroadCar(railroadCarForToxicMaterials19);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet19);


        //20 train set
        Locomotive locomotive20 = new Locomotive("Poznan", "Krakow", "Zakopane");
        TrainSet trainSet20 = new TrainSet(locomotive20, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage20 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage20.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForBaggage20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers20 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers20.loadingPeople(29);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForPassengers20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant20 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant20.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForRestaurant20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight20 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight20.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForHeavyFreight20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator20 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator20.loadingRailroadCar(860);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForRefrigerator20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials20 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials20.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForLiquidAndToxicMaterials20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials20 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials20.loadingRailroadCar
                        (400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet20.connectRailroadCar(railroadCarForToxicMaterials20);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet20);


        //21 train set
        Locomotive locomotive21 = new Locomotive("Poznan", "Lublin", "Lviv");
        TrainSet trainSet21 = new TrainSet(locomotive21, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage21 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage21.loadingRailroadCar
                        (960);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForBaggage21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers21 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers21.loadingPeople(69);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForPassengers21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant21 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant21.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForRestaurant21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight21 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight21.loadingRailroadCar
                        (690);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForHeavyFreight21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator21 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator21.loadingRailroadCar(860);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForRefrigerator21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials21 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials21.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForLiquidAndToxicMaterials21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials21 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials21.loadingRailroadCar
                        (400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet21.connectRailroadCar(railroadCarForToxicMaterials21);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet21);


        //22 train set
        Locomotive locomotive22 = new Locomotive("Poznan", "Lublin", "Kiev");
        TrainSet trainSet22 = new TrainSet(locomotive22, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage22 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage22.loadingRailroadCar
                        (260);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForBaggage22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers22 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers22.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForPassengers22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant22 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant22.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForRestaurant22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight22 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight22.loadingRailroadCar
                        (300);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForHeavyFreight22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator22 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator22.loadingRailroadCar(460);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForRefrigerator22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials22 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials22.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForLiquidAndToxicMaterials22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials22 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials22.loadingRailroadCar
                        (490);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet22.connectRailroadCar(railroadCarForToxicMaterials22);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet22);


        //23 train set
        Locomotive locomotive23 = new Locomotive("Poznan", "Krakow", "Osweciem");
        TrainSet trainSet23 = new TrainSet(locomotive23, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage23 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage23.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForBaggage23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers23 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers23.loadingPeople(29);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForPassengers23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant23 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant23.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForRestaurant23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight23 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight23.loadingRailroadCar
                        (678);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForHeavyFreight23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator23 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator23.loadingRailroadCar(870);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForRefrigerator23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials23 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials23.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForLiquidAndToxicMaterials23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials23 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials23.loadingRailroadCar
                        (400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet23.connectRailroadCar(railroadCarForToxicMaterials23);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet23);


        //24 train set
        Locomotive locomotive24 = new Locomotive("Poznan", "Osweciem",
                "Ostrava");
        TrainSet trainSet24 = new TrainSet(locomotive24, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage24 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage24.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForBaggage24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers24 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers20.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForPassengers24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant24 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant24.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForRestaurant24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight24 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight24.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForHeavyFreight24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator24 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator24.loadingRailroadCar(160);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForRefrigerator24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials24 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials24.loadingRailroadCar
                        (760);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForLiquidAndToxicMaterials24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials24 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials24.loadingRailroadCar
                        (400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet24.connectRailroadCar(railroadCarForToxicMaterials24);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet24);


        //25 train set
        Locomotive locomotive25 = new Locomotive("Poznan", "Ostrava", "Prague");
        TrainSet trainSet25 = new TrainSet(locomotive25, dispatcher);
        RailroadCarForBaggage railroadCarForBaggage25 = new RailroadCarForBaggage();
        try {

            try {
                railroadCarForBaggage25.loadingRailroadCar
                        (780);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForBaggage25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForPassengers railroadCarForPassengers25 = new RailroadCarForPassengers();
        try {

            try {
                railroadCarForPassengers25.loadingPeople(39);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForPassengers25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRestaurant railroadCarForRestaurant25 = new RailroadCarForRestaurant();
        try {

            try {
                railroadCarForRestaurant25.loadingRailroadCar(900);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForRestaurant25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForHeavyFreight railroadCarForHeavyFreight25 = new RailroadCarForHeavyFreight();
        try {

            try {
                railroadCarForHeavyFreight25.loadingRailroadCar
                        (600);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForHeavyFreight25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForRefrigerator railroadCarForRefrigerator25 = new RailroadCarForRefrigerator();
        try {

            try {
                railroadCarForRefrigerator25.loadingRailroadCar(860);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForRefrigerator25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials25 =
                new RailroadCarForLiquidAndToxicMaterials();
        try {
            try {
                railroadCarForLiquidAndToxicMaterials25.loadingRailroadCar
                        (777);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForLiquidAndToxicMaterials25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        RailroadCarForToxicMaterials railroadCarForToxicMaterials25 = new RailroadCarForToxicMaterials();
        try {
            try {
                railroadCarForToxicMaterials25.loadingRailroadCar
                        (400);
            } catch (LoadingLimit e) {
                System.out.println(e.getMessage());
                throw new ConnectImpossible("Cannot add railroad car to " + "train set, because " + e.getMessage());
            }

            trainSet25.connectRailroadCar(railroadCarForToxicMaterials25);
        } catch (ConnectImpossible e) {
            System.out.println(e.getMessage());
        }
        dispatcher.addTrainSet(trainSet25);

        TrainSet trainSet = null;

        int option = -1;

        while (option != 0) {
            System.out.println("Main menu:");
            System.out.println("1. Train management");
            System.out.println("2. Railway network management");
            System.out.println("3. Reports");
            System.out.println("4. Start");
            System.out.println("5. Stop");
            System.out.println("0. Exit the application");

            System.out.println("Choose one option:");
            option = scanner.nextInt();

            switch (option) {

                case 1:
                    int subOption = -1;

                    while (subOption != 5) {
                        System.out.println("1. Create train set");
                        System.out.println("2. Add car");
                        System.out.println("3. Remove car");
                        System.out.println("4. Info about train set");
                        System.out.println("5. Back to main menu");

                        subOption = scanner.nextInt();

                        switch (subOption) {
                            case 1:
                                System.out.println("Enter the home station, source station, destination station:");
                                System.out.println("Home station: ");
                                String homeStation = scanner.next();
                                System.out.println("Source station: ");
                                String sourceStation = scanner.next();
                                System.out.println("Destination station: ");
                                String destinationStation = scanner.next();
                                Locomotive locomotive = new Locomotive(homeStation, sourceStation, destinationStation);
                                trainSet = new TrainSet(locomotive, dispatcher);
                                dispatcher.addTrainSet(trainSet);
                                break;
                            case 2:
                                String subOptionToAdd = "";

                                while (!subOptionToAdd.equals("Exit")) {

                                    System.out.println("Add railroad car to train set. Enter the type of railroad car. " +
                                            "And Exit to exit from this command");

                                    subOptionToAdd = scanner.next();
                                    if (trainSet != null) {
                                        switch (subOptionToAdd) {
                                            case "Mail":
                                                RailroadCarForMail railroadCarForMail = new RailroadCarForMail();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfMail = scanner.nextInt();
                                                    try {
                                                        railroadCarForMail.loadingRailroadCar(weightOfMail);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForMail);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "PostOffice":
                                                RailroadCarForPostOffice railroadCarForPostOffice =
                                                        new RailroadCarForPostOffice();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfPostOffice = scanner.nextInt();
                                                    try {
                                                        railroadCarForPostOffice.loadingRailroadCar(weightOfPostOffice);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForPostOffice);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "Passengers":
                                                RailroadCarForPassengers railroadCarForPassengers =
                                                        new RailroadCarForPassengers();
                                                try {

                                                    System.out.println("Enter the amount of people to load into " +
                                                            "railroad car:");

                                                    int passengers = scanner.nextInt();
                                                    try {
                                                        railroadCarForPassengers.loadingPeople(passengers);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForPassengers);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "Refrigerator":
                                                RailroadCarForRefrigerator railroadCarForRefrigerator =
                                                        new RailroadCarForRefrigerator();
                                                try {

                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfRefrigerator = scanner.nextInt();
                                                    try {
                                                        railroadCarForRefrigerator.
                                                                loadingRailroadCar(weightOfRefrigerator);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForRefrigerator);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "Restaurant":
                                                RailroadCarForRestaurant railroadCarForRestaurant =
                                                        new RailroadCarForRestaurant();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfRestaurant = scanner.nextInt();
                                                    try {
                                                        railroadCarForRestaurant.loadingRailroadCar(weightOfRestaurant);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForRestaurant);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "ToxicMaterials":
                                                RailroadCarForToxicMaterials railroadCarForToxicMaterials =
                                                        new RailroadCarForToxicMaterials();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfToxicMaterials = scanner.nextInt();
                                                    try {
                                                        railroadCarForToxicMaterials.loadingRailroadCar
                                                                (weightOfToxicMaterials);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForToxicMaterials);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "GaseousMaterials":
                                                RailroadCarForGaseousMaterials railroadCarForGaseousMaterials =
                                                        new RailroadCarForGaseousMaterials();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfGaseousMaterials = scanner.nextInt();
                                                    try {
                                                        railroadCarForGaseousMaterials.loadingRailroadCar
                                                                (weightOfGaseousMaterials);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForGaseousMaterials);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "ExplosiveMaterials":
                                                RailroadCarForExplosiveMaterials railroadCarForExplosiveMaterials =
                                                        new RailroadCarForExplosiveMaterials();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfExplosiveMaterials = scanner.nextInt();
                                                    try {
                                                        railroadCarForExplosiveMaterials.loadingRailroadCar
                                                                (weightOfExplosiveMaterials);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }
                                                    trainSet.connectRailroadCar(railroadCarForExplosiveMaterials);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "BasicFreight":
                                                RailroadCarForBasicFreight railroadCarForBasicFreight =
                                                        new RailroadCarForBasicFreight();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfBasicFreight = scanner.nextInt();
                                                    try {
                                                        railroadCarForBasicFreight.loadingRailroadCar
                                                                (weightOfBasicFreight);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }
                                                    trainSet.connectRailroadCar(railroadCarForBasicFreight);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "Baggage":
                                                RailroadCarForBaggage railroadCarForBaggage =
                                                        new RailroadCarForBaggage();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfBaggage = scanner.nextInt();
                                                    try {
                                                        railroadCarForBaggage.loadingRailroadCar
                                                                (weightOfBaggage);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForBaggage);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "HeavyFreight":
                                                RailroadCarForHeavyFreight railroadCarForHeavyFreight =
                                                        new RailroadCarForHeavyFreight();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfHeavyFreight = scanner.nextInt();
                                                    try {
                                                        railroadCarForHeavyFreight.loadingRailroadCar
                                                                (weightOfHeavyFreight);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForHeavyFreight);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "LiquidMaterials":
                                                RailroadCarForLiquidMaterials railroadCarForLiquidMaterials =
                                                        new RailroadCarForLiquidMaterials();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfLiquidMaterials = scanner.nextInt();
                                                    try {
                                                        railroadCarForLiquidMaterials.loadingRailroadCar
                                                                (weightOfLiquidMaterials);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForLiquidMaterials);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }
                                                break;
                                            case "LiquidAndToxicMaterials":
                                                RailroadCarForLiquidAndToxicMaterials railroadCarForLiquidAndToxicMaterials =
                                                        new RailroadCarForLiquidAndToxicMaterials();
                                                try {
                                                    System.out.println("Enter the weight to load into railroad car:");

                                                    int weightOfLiquidAndToxicMaterials = scanner.nextInt();
                                                    try {
                                                        railroadCarForLiquidAndToxicMaterials.loadingRailroadCar
                                                                (weightOfLiquidAndToxicMaterials);
                                                    } catch (LoadingLimit e) {
                                                        System.out.println(e.getMessage());
                                                        throw new ConnectImpossible("Cannot add railroad car to " +
                                                                "train set, because " + e.getMessage());
                                                    }

                                                    trainSet.connectRailroadCar(railroadCarForLiquidAndToxicMaterials);
                                                } catch (ConnectImpossible e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case "Exit" :
                                                break;
                                            default:
                                                System.out.println("Incorrect type");
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 3:

                                String subOptionToRemove = "";

                                while (!subOptionToRemove.equals("Exit")) {

                                    System.out.println("Remove railroad car from train set. " +
                                            "Enter the railroad car ID. And Exit if you want to cancel this command");

                                    subOptionToRemove = scanner.next();
                                    if (trainSet != null) {
                                        trainSet.removeRailroadCar(subOptionToRemove);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                dispatcher.infoAboutTrainSet();
                                break;
                        }
                    }
                    break;
                case 2:

                    int subOptionToAddSegment = -1;


                    while (subOptionToAddSegment != 0) {

                        System.out.println("1. Add segment to railway network");
                        System.out.println("2. Get all information about railway network");
                        System.out.println("0. Back to main menu");

                        subOptionToAddSegment = scanner.nextInt();

                        switch (subOptionToAddSegment) {
                            case 1:
                                System.out.println("Enter the first city: ");
                                String city1 = scanner.next();
                                System.out.println("Enter the second city: ");
                                String city2 = scanner.next();
                                System.out.println("Enter the distance between these cities: ");
                                double distance = scanner.nextDouble();
                                dispatcher.addSegmentToMap(city1, city2, distance);
                                break;
                            case 2:
                                dispatcher.printInfoAboutSegment();
                                break;
                        }
                    }
                    break;
                case 3:

                    System.out.println("Enter the locomotiveID:");
                    String locomotiveId = scanner.next();

                    dispatcher.report(locomotiveId);

                    break;
                case 4:
                    dispatcher.startTrainSets();
                    break;
                case 5:
                    dispatcher.stopTrainSets();
                    break;
                case 0:
                    break;

            }

        }
    }
}


