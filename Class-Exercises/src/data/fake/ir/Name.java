package data.fake.ir;

import java.util.Random;

public class Name {

    private static final Random random = new Random();

    private static final String[] womenNames = {
            "Anahita",
            "Ariana",
            "Ava",
            "Azadeh",
            "Daria",
            "Farah",
            "Fatemeh",
            "Leila",
            "Mahnaz",
            "Maryam",
            "Mona",
            "Nahid",
            "Nasrin",
            "Nazanin",
            "Niloufar",
            "Roxana",
            "Sara",
            "Shirin",
            "Soraya",
            "Tara",
            "Yasmin",
            "Alya",
            "Asal",
            "Bahar",
            "Baran",
            "Dana",
            "Donya",
            "Esther",
            "Firuzeh",
            "Iman",
            "Iran",
            "Mahsa",
            "Mehr",
            "Mina",
            "Minoo",
            "Neda",
            "Nima",
            "Noor",
            "Parisa",
            "Roya",
            "Shadi",
            "Shahnaz",
            "Shams",
            "Yasaman",
            "Zahra",
            "Ziba",
            "Arezou",
            "Elaheh",
            "Fariba",
            "Farzaneh",
            "Fereshteh",
            "Gol",
            "Golnar",
            "Jaleh",
            "Katayoun",
            "Mahtab",
            "Masoumeh",
            "Mehr-Afarin",
            "Parvin",
            "Rana",
            "Roshan",
            "Samira",
            "Sepideh",
            "Shahrazad",
            "Shiraz",
            "Shiva",
            "Shokoufeh",
            "Zarin",
            "Azar",
            "Delara",
            "Golnaz",
            "Laleh",
            "Mahin",
            "Manijeh",
            "Marjan",
            "Mehr-Naz",
            "Mojgan",
            "Negar",
            "Negin",
            "Parvaneh",
            "Setareh",
            "Shohreh",
            "Sima",
            "Vida",
            "Zohreh"
    };

    private static final String[] menNames = {
            "Ahmad",
            "Ali",
            "Ashraf",
            "Babak",
            "Behrouz",
            "Behzad",
            "Farhad",
            "Farid",
            "Farzad",
            "Hossein",
            "Kamran",
            "Karim",
            "Nader",
            "Reza",
            "Salman",
            "Solayman",
            "Soroush",
            "Abbas",
            "Amir",
            "Arash",
            "Bijan",
            "Borzou",
            "Cyrus",
            "Eskandar",
            "Fereydoon",
            "Firouz",
            "Kai-Khosrow",
            "Kasra",
            "Khosrow",
            "Mahmoud",
            "Mansour",
            "Manuchehr",
            "Nasser",
            "Parviz",
            "Rostam",
            "Sharyar",
            "Amin",
            "Ashkan",
            "Darius",
            "Hassan",
            "Javad",
            "Kaveh",
            "Kazem",
            "Masoud",
            "Mehrdad",
            "Shahin",
            "Azad",
            "Aziz",
            "Bahman",
            "Davud",
            "Esfandiar",
            "Hormoz",
            "Jahan",
            "Jamshid",
            "Kambiz",
            "Navud",
            "Payam",
            "Rahman",
            "Arman",
            "Keyvan",
            "Kian",
            "Mahdi",
            "Milad",
            "Mirza",
            "Morteza",
            "Omid",
            "Pirouz",
            "Ramin",
            "Shapour",
    };

    private static final String[] lastNames = {
            "Amani",
            "Ansari",
            "Azad",
            "Azimi",
            "Bayat",
            "Imani",
            "Khani",
            "Masoumi",
            "Mehri",
            "Mirza",
            "Salmani",
            "Shiri",
            "Shokri",
            "Abbasi",
            "Abid",
            "Ahmadi",
            "Akbari",
            "Amiri",
            "Anvari",
            "Araki",
            "Bukhari",
            "Ebrahimi",
            "Gharabaghi",
            "Ghasemi",
            "Ghorbani",
            "Hakimi",
            "Hashemi",
            "Heydari",
            "Hosseini",
            "Jafari",
            "Karimi",
            "Kazemi",
            "Madani",
            "Alizadeh",
            "Amini",
            "Azizi",
            "Mir",
            "Najafi",
            "Nazari",
            "Rahmani",
            "Rostami",
            "Safari",
            "Salehi",
            "Sharifi",
            "Soltani",
            "Souleimani",
            "Taheri",
            "Tehrani",
            "Yazdani",
            "Yousefi",
            "Zare",
            "Abbas",
            "Abdi",
            "Arab",
            "Asgari",
            "Bahrami",
            "Fallah",
            "Farahmand",
            "Fathi",
            "Habibi",
            "Hasani",
            "Jamshidi",
            "Khalili",
            "Khorrami",
            "Kiani",
            "Latifi",
            "Maleki",
            "Mirzaei",
            "Mohammadi",
            "Mousavi",
            "Nasri",
            "Nazeri",
            "Nouri",
            "Parsi",
            "Rahimi",
            "Rashidi",
            "Rouhani",
            "Sadeghi",
            "Safavi",
            "Sattari",
            "Sidiqi",
            "Tabataei",
            "Turan",
            "Zadeh",
            "Zafar",
            "Zaman",
            "Zargari"
    };

    public static String getRandomWomanName() {
        return womenNames[random.nextInt(womenNames.length)];
    }

    public static String getRandomManName() {
        return menNames[random.nextInt(menNames.length)];
    }

    public static String getRandomLastName() {
        return lastNames[random.nextInt(lastNames.length)];
    }
}
