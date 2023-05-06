package edu.guilford;

import java.util.Random;

public class Cars {
    Random rand = new Random();

    // attributes 

    private String brand;
    private String carModel;
    private int year;
    private int price;
    private int mileage;
    private String condition;
    private double value;
    // Constructor 

    // Choose a random brand from the list of 15 car brands
    public Cars() {
        String[] brands = { "Lexus", "Infiniti", "Dodge", "Kia", "Tesla",
         "Mazda", "Buick", "Nissan", "Alfa Romeo",
          "Jaguar", "GMC", "Cadillac", "Fiat", "Porsche", "Honda"};
        brand = brands[rand.nextInt(brands.length)];
        
        // Choose 4 random car models from the list of 20 car brands
        String[] LexusModels = { "ES", "GS", "GX", "IS",};
        String[] InfinitiModels = { "Q50", "Q60", "Q70", "QX30",};
        String[] DodgeModels = { "Challenger", "Charger", "Durango", "Grand Caravan",};
        String[] KiaModels = { "Forte", "Optima", "Rio", "Sedona",};
        String[] TeslaModels = { "Model 3", "Model S", "Model X", "Model Y",};
        String[] MazdaModels = { "CX-3", "CX-5", "CX-9", "Mazda3",};
        String[] BuickModels = { "Encore", "Enclave", "Envision", "Regal",};
        String[] NissanModels = { "Altima", "Frontier", "Maxima", "Rogue",};
        String[] AlfaRomeoModels = { "Giulia", "Stelvio", "4C", "8C",};
        String[] JaguarModels = { "E-Pace", "F-Pace", "I-Pace", "XJ",};
        String[] GMCModels = { "Acadia", "Canyon", "Sierra", "Terrain",};
        String[] CadillacModels = { "ATS", "CT6", "CTS", "Escalade",};
        String[] FiatModels = { "124 Spider", "500", "500L", "500X",};
        String[] PorscheModels = { "718 Boxster", "718 Cayman", "911", "Cayenne",};
        String[] HondaModels = { "Accord", "Civic", "CR-V", "Fit",};

     
    // Conditional statements to assign a random car model based on the brand
        if (brand.equals("Lexus")) {
            carModel = LexusModels[rand.nextInt(4)];
        } else if (brand.equals("Infiniti")) {
            carModel = InfinitiModels[rand.nextInt(4)];
        } else if (brand.equals("Dodge")) {
            carModel = DodgeModels[rand.nextInt(4)];
        } else if (brand.equals("Kia")) {
            carModel = KiaModels[rand.nextInt(4)];
        } else if (brand.equals("Tesla")) {
            carModel = TeslaModels[rand.nextInt(4)];
        } else if (brand.equals("Mazda")) {
            carModel = MazdaModels[rand.nextInt(4)];
        } else if (brand.equals("Buick")) {
            carModel = BuickModels[rand.nextInt(4)];
        } else if (brand.equals("Nissan")) {
            carModel = NissanModels[rand.nextInt(4)];
        } else if (brand.equals("Alfa Romeo")) {
            carModel = AlfaRomeoModels[rand.nextInt(4)];
        } else if (brand.equals("Jaguar")) {
            carModel = JaguarModels[rand.nextInt(4)];
        } else if (brand.equals("GMC")) {
            carModel = GMCModels[rand.nextInt(4)];
        } else if (brand.equals("Cadillac")) {
            carModel = CadillacModels[rand.nextInt(4)];
        } else if (brand.equals("Fiat")) {
            carModel = FiatModels[rand.nextInt(4)];
        } else if (brand.equals("Porsche")) {
            carModel = PorscheModels[rand.nextInt(4)];
        } else if (brand.equals("Honda")) {
            carModel = HondaModels[rand.nextInt(4)];
        }
 
        // Year is a random number between 1990 and 2024
        year = rand.nextInt(2024 - 1990) + 1990;
        // Price is a random number between 1000 and 100000
        price = rand.nextInt(100000 - 1000) + 1000;
        // Mileage is a random number between 0 and 200000
        mileage = rand.nextInt(200000 - 0) + 0;
        // Condition is a random number between 0 and 4
        int conditionNum = rand.nextInt(4 - 0) + 0;
        // Conditional statements to assign a condition based on the conditionNum
        if (conditionNum == 0) {
            condition = "New";
        } else if (conditionNum == 1) {
            condition = "Used";
        } else if (conditionNum == 2) {
            condition = "Certified Pre-Owned";
        } else if (conditionNum == 3) {
            condition = "Damaged";
        }     
        // Value is calculated using the calculateCarValue method
        value = this.calculateCarValue();
    }
        // Getters and Setters 
        // Brand getter and setter
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            // Validation to make sure that 
            // brand does not appear to be null or empty in the output
           
        //         this.brand = brand;
        // }
    }
        // Car model getter and setter
        public String getCarModel() {
            return carModel;
        }

        public void setCarModel(String carModel) {
           // Validation to make sure that 
           // carModel does not appear to be null or empty in the output
            if (carModel != null && !carModel.isEmpty()) {
            this.carModel = carModel;
        }
    }
        // Year getter and setter
        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        // Price getter and setter
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        // Mileage getter and setter

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
                this.mileage = mileage;
            }
            

        // Condition getter and setter

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        // toString method
        @Override
            public String toString() {
                return "Brand: " + brand + ", Car Model: " + carModel + ", Year: " + year + ", Price: " + price + ", Mileage: "
                        + mileage + ", Value: " + String.format("%,.2f", value);
            }
         
            // Method that calculates each car's value percentage based on the year, price, mileage, and condition
            public double calculateCarValue() {
              // set value at 100 percent
                double value = 100;
                // make sure that value is not less than 0 percent
                if (value < 0) {
                    value = 0;
                }
                // if the car is older than 10 years, subtract 10 percent from the value
                if (year < 2011) {
                    value -= 10;
                } else if (year < 2016) {
                    // if the car is older than 5 years, subtract 5 percent from the value
                    value -= 5;
                } else if (year < 2021) {
                    // if the car is older than 1 year, subtract 1 percent from the value
                    value -= 1;
                }
                // if the car is more than 100000 dollars, subtract 10 percent from the value

                if (price > 100000) {
                    value -= 10;
                } else if (price > 50000) {
                    // if the car is more than 50000 dollars, subtract 5 percent from the value
                    value -= 5;
                } else if (price > 25000) {
                    // if the car is more than 25000 dollars, subtract 2 percent from the value
                    value -= 2;
                } else if (price > 10000) {
                    // if the car is more than 10000 dollars, subtract 1 percent from the value
                    value -= 1;
                }

                

                // if the car has more than 200000 miles, subtract 10 percent from the value
                if (mileage > 200000) {
                    value -= 10;
                } else if (mileage > 100000) {
                    // if the car has more than 100000 miles, subtract 5 percent from the value
                    value -= 5;
                } else if (mileage > 50000) {
                    // if the car has more than 50000 miles, subtract 2 percent from the value
                    value -= 2;
                } else if (mileage > 10000) {
                    // if the car has more than 10000 miles, subtract 1 percent from the value
                    value -= 1;
                } 
        

                // if the car is damaged, subtract 10 percent from the value
                if (condition.equals("Damaged")) {
                    value -= 10;
                } else if (condition.equals("Certified Pre-Owned")) {
                    // if the car is certified pre-owned, subtract 5 percent from the value
                    value -= 5;
                } else if (condition.equals("Used")) {
                    // if the car is used, subtract 2 percent from the value
                    value -= 2;
                } else if (condition.equals("New")) {
                    // if the car is new, subtract 1 percent from the value
                    value -= 1;
                }

                // return the value
                return value;
            }
            





                

                


        
        
       


        



    }




