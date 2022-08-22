







class TtoC {




    private Double convert(Double centi) {

        //Logikk 
        //Konverterer fra Tommer til Centimeter

        //Definerer tomme dom en double med verdi 2.54
        //Definerer at centi til tommer er centi / tomme
        Double tomme = 2.54;
        Double ctt = centi / tomme;

        //Returnerer den koverterte verdien
        return ctt;
    }




    private static Double[] dataSet = new Double[] {2.3, 1.2, 1.5, 10.2, 59.42};



    public static void main(String[] args)  {


        //Skaper et objekt
        TtoC converter = new TtoC();

        for (int i = 0; i < dataSet.length; i++) {
            System.out.println(converter.convert(dataSet[i]));

        }
    }
}