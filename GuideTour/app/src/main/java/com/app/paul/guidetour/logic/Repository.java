        package com.app.paul.guidetour.logic;

        import com.app.paul.guidetour.R;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

        /**
         * Repository class
         */

        public class Repository {
            private List<PlacesES> listPlacesES;

            //Returns list of restaurants
            public List<PlacesES> getRestaurants(){
                listPlacesES = new ArrayList<>();
                listPlacesES.add(new PlacesES(
                        "La Bodega Italiana",
                        "San Salvador",
                        "La Gran Vía, Carretera Panamericana y Calle Chiltiupán. Antiguo Cuscatlán, La Libertad, Centro Comercial La Gran Vía, Local 401 - 402",
                        "2536 8888"
                        ,"http://bodegaitaliana.com.sv/"
                        , Arrays.asList(R.drawable.la_bodega_1,R.drawable.la_bodega_2)));

                listPlacesES.add(new PlacesES(
                        "Zanzibar",
                        "San Salvador",
                        "Zanzibar, Colonia San Benito, San Salvador",
                        "2511 4282"
                        ,"http://www.barzanzibar.com/"
                        ,Arrays.asList(R.drawable.zanzibar_1,R.drawable.zanzibar_2)));

                listPlacesES.add(new PlacesES(
                        "Al Pomodoro",
                        "San Salvador",
                        "Ave. La Revolución y Calle Circunvalación No. 184, San Salvador CP 1101",
                        "2243 7388"
                        ,"http://alpomodoro.com.sv/"
                        ,Arrays.asList(R.drawable.al_pomodoro_1,R.drawable.al_pomodoro_2)));

                listPlacesES.add(new PlacesES(
                        "Bravissimo",
                        "San Salvador",
                        "Col. Escalón No. 127, Pje Istmania, San Salvador",
                        " 2223 3986"
                        ,"NO WEB SITE"
                        ,Arrays.asList(R.drawable.bravissimo_1,R.drawable.bravissimo_2)));
                listPlacesES.add(new PlacesES(
                        "La Pizzeria",
                        "San Salvador",
                        "Plaza Los Castaños, Avenida Masferrer Norte, San Salvador",
                        "2566 6574"
                        ,"http://www.lapizzeria.com/"
                        ,Arrays.asList(R.drawable.la_pizzeria_1,R.drawable.la_pizzeria_2)));
                listPlacesES.add(new PlacesES(
                        "Panino's ",
                        "El Tunco",
                        "Playa el Tunco Plaza Tunco Town, El Tunco El Salvador",
                        "7698 6999"
                        ,"https://www.facebook.com/pg/paninos.sv/about/?ref=page_internal"
                        ,Arrays.asList(R.drawable.panino_1,R.drawable.panino_2)));
                listPlacesES.add(new PlacesES(
                        "Royal",
                        "San Salvador",
                        "87 Avenida Sur, San Salvador",
                        "2264 0051"
                        ,"NO WEB SITE"
                        ,Arrays.asList(R.drawable.royal_1,R.drawable.royal_2)));
                listPlacesES.add(new PlacesES(
                        "Style 68",
                        "Santa Tecla",
                        "16 Avenida Nte, Santa Tecla",
                        "2246 4875"
                        ,"https://www.facebook.com/Style68chinesecuisine/"
                        ,Arrays.asList(R.drawable.style68_1,R.drawable.style68_2)));

                return listPlacesES;
            }

            //Returns list of coffee
            public List<PlacesES> getCoffee() {
                listPlacesES = new ArrayList<>();
                listPlacesES.add(new PlacesES(
                        "Juan Valdez Café Galerías",
                        "San Salvador",
                        "Juan Valdez Café Galerías, San Salvador",
                        "2264 9999",
                         "http://www.juanvaldezcafe.com/",
                         Arrays.asList(R.drawable.juan_valdez_1, R.drawable.juan_valdez_2)));
                listPlacesES.add(new PlacesES(
                        "Andian Pâttiserie & Cafe",
                        "San Salvador",
                        "Plaza Catalonia #260 El, Calle La Mascota, San Salvador",
                        " 2223 8770",
                        "https://www.facebook.com/AndianSV/?utm_source=tripadvisor&utm_medium=referral",
                        Arrays.asList(R.drawable.andian_1, R.drawable.andian_2)));
                listPlacesES.add(new PlacesES(
                        "Gecko Cafe",
                        "San Salvador",
                        "89 Avenida Norte, San Salvador",
                        "2527 5976",
                        "https://www.facebook.com/Paletas-Gecko-289454007760463/",
                        Arrays.asList(R.drawable.gecko_1, R.drawable.gecko_2)));
                listPlacesES.add(new PlacesES(
                        "The Coffee Cup",
                        "San Salvador",
                        "Centro Comercial Paseo General Escalón., Paseo Gral. Escalón, San Salvador",
                        "2219 6583",
                        "http://www.thecoffeecup.com.sv/frontend/index.php",
                        Arrays.asList(R.drawable.coffe_cup_1, R.drawable.coffe_cup_2)));
                listPlacesES.add(new PlacesES(
                        "Viva Espresso",
                        "San Salvador",
                        "Bulevar Del Hipodromo 644, San Salvador",
                        "2264 2463",
                        "http://vivaespressocoffee.com/index.html",
                        Arrays.asList(R.drawable.viva_espresso_1, R.drawable.viva_espresso_2)));
                listPlacesES.add(new PlacesES(
                        "Starbucks",
                        "San Salvador",
                        "World Trade Center, Calle del mirador, San Salvador",
                        " 7069 9397",
                        "https://www.facebook.com/StarbucksElSalvador/",
                        Arrays.asList(R.drawable.starbucks_1, R.drawable.starbucks_2)));
                listPlacesES.add(new PlacesES(
                        "Las Brumas | Grill & Cafe |",
                        "San Salvador",
                        "San Salvador CP 1101",
                        "2508 0454",
                        "https://restaurantelasbrumas.business.site/",
                        Arrays.asList(R.drawable.las_brumas_1, R.drawable.las_brumas_2)));
                listPlacesES.add(new PlacesES(
                        "Cafe sunzal",
                        "La Libertad",
                        "CA-2, El Sunzal",
                        "2355 7137",
                        "http://www.casademarhotel.com/v2/restaurant",
                        Arrays.asList(R.drawable.cafe_sunzal_1, R.drawable.cafe_sunzal_2)));

                return listPlacesES;

            }

            //Returns list of hotels
            public List<PlacesES> getListHotelss(){
                listPlacesES = new ArrayList<>();
                listPlacesES.add(new PlacesES(
                        "Hotel Barcelo",
                        "San Salvador",
                        "Ave las Magnolias y Blvd del Hipodromo, San Salvador",
                        "2133 7000"
                        ,"https://www.barcelo.com/es/barcelo-hotels/hoteles/el-salvador/san-salvador/barcelo-san-salvador/?utm_source=google&utm_medium=organic&utm_campaign=my_business&utm_content=h397"
                        ,Arrays.asList(R.drawable.barcelo_1, R.drawable.barcelo_2)));

                listPlacesES.add(new PlacesES(
                        "Hotel Crowne Plaza",
                        "San Salvador",
                        "89 Avenida Norte y 11 Calle Poniente, San Salvador",
                        "7859 5095"
                        ,"https://www.ihg.com/crowneplaza/hotels/us/en/reservation"
                        ,Arrays.asList(R.drawable.crowne_plaza_1, R.drawable.crowne_plaza_2)));

                listPlacesES.add(new PlacesES(
                        "Hotel Holiday Inn",
                        "San Salvador",
                        "Blvd y Urbanizacion Santa Elena | Calle el pital Oriente, 400 mts al Norte de Embajada Americana, San Salvador",
                        "2500 6000"
                        ,"https://www.ihg.com/holidayinn/hotels/us/en/san-salvador/sslrc/hoteldetail"
                        ,Arrays.asList(R.drawable.holiday_in_1, R.drawable.holiday_in_2)));

                listPlacesES.add(new PlacesES(
                        "Hotel Marela",
                        "San Salvador",
                        "Colonia Escalón,83 Avenida Sur, Calle Juan Jose Canas 5, San Salvador",
                        "2507 4400"
                        ,"http://hotelmarela.com.sv/"
                        ,Arrays.asList(R.drawable.hotel_marela_1, R.drawable.hotel_marela_2)));
                listPlacesES.add(new PlacesES(
                        "Hotel Mirador Plaza",
                        "San Salvador",
                        "Calle El Mirador 95, San Salvador",
                        "2244 6000"
                        ,"http://www.fairwayhotels.com/Hotel/Hotel_Mirador_Plaza.htm"
                        ,Arrays.asList(R.drawable.mirador_plaza_1, R.drawable.mirador_plaza_2)));
                listPlacesES.add(new PlacesES(
                        "Hotel Presidente",
                        "San Salvador",
                        "Avenida De La Revolucion, San Salvador",
                        "2283 4000"
                        ,"https://www.marriott.com/hotels/travel/salsi-sheraton-presidente-san-salvador-hotel/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2"
                        ,Arrays.asList(R.drawable.hotel_presidente_1, R.drawable.hotel_presidente_2)));
                listPlacesES.add(new PlacesES(
                        "Hotel Real Intercontinental",
                        "San Salvador",
                        "Boulevard De Los Heroes And, San Salvador",
                        "2211 3333"
                        ,"https://www.ihg.com/intercontinental/hotels/us/en/san-salvador/sslhb/hoteldetail?cm_mmc=GoogleMaps-_-IC-_-SV-_-SSLHB"
                        ,Arrays.asList(R.drawable.intercontinental_1,R.drawable.intercontinental_2)));
                listPlacesES.add(new PlacesES(
                        "Hotel Sal y Luz",
                        "San Salvador",
                        "Col Campestre Cl A No 13-76 Ent Av Juan Ramón Molina San Salvador",
                        " 2519 9595"
                        ,"http://salyluzhotels.com/"
                        ,Arrays.asList(R.drawable.sal_luz_1, R.drawable.sal_luz_2)));
                listPlacesES.add(new PlacesES(
                        "Hotel Terraza",
                        "San Salvador",
                        "Calle Padres Aguilar, San Salvador",
                        "2565 7000"
                        ,"http://www.terraza.com.sv/index.php/es/"
                        ,Arrays.asList(R.drawable.terraza_1, R.drawable.terraza_2)));
                return listPlacesES;
            }

            //Returns list of tourist places
            public List<PlacesES> getPlaces() {
                listPlacesES = new ArrayList<>();
                listPlacesES.add(new PlacesES(
                        "El Tunco",
                        "La Libertad",
                        "El Tunco, La libertad, El Salvador",
                        "NO PHONE"
                        , "NO WEB PAGE"
                        , Arrays.asList(R.drawable.el_tunco_1, R.drawable.el_tunco_2)));

                listPlacesES.add(new PlacesES(
                        "Lago de Coatepeque",
                        "El Congo",
                        "Lago de Coatepeque, El Salvador",
                        "NO PHONE"
                        , "NO WEB PAGE"
                        , Arrays.asList(R.drawable.lago_coatepeque, R.drawable.lago_coatepeque_2)));
                listPlacesES.add(new PlacesES(
                        "Joya de Cerén",
                        "La Libertad",
                        "Km 32, Carr San Juan Opico - Agua Escondida",
                        "2401 5782"
                        , "http://www.cultura.gob.sv/parque-arqueologico-joya-de-ceren/"
                        , Arrays.asList(R.drawable.joya_1, R.drawable.joya_2)));
                listPlacesES.add(new PlacesES(
                        "El Boqueron",
                        "San Salvador",
                        "Calle al Parque Nacional El Boqueron, San Salvador,",
                        "NO PHONE"
                        , "NO WEB PAGE"
                        , Arrays.asList(R.drawable.boqueron_1, R.drawable.boqueron_2)));
                listPlacesES.add(new PlacesES(
                        "Tazumal",
                        "Chalchuapa",
                        "Calle Tazumal, Chalchuapa",
                        "2444 0010"
                        , "NO WEB PAGE"
                        , Arrays.asList(R.drawable.tazumal_1, R.drawable.tazumal_2)));
                listPlacesES.add(new PlacesES(
                        "Volcan de Santa Ana",
                        "Santa Ana",
                        "Volcán de Santa Ana, El Salvador",
                        "NO PHONE"
                        , "NO WEB PAGE"
                        , Arrays.asList(R.drawable.volcan_santa_ana_1, R.drawable.volcan_santa_ana_2)));
                return listPlacesES;
            }


        }
