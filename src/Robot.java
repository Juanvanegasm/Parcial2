public class Robot {
        private Bateria bateria;
        private boolean dormido;

        public Robot() {
            this.bateria = new Bateria(1000);
            this.dormido = false;
        }

        public void avanzar(int pasos) {
            if (dormido) {
                System.out.println("el robot está dormido");
                return;
            }
            if (bateria.getCarga() == 0) {
                System.out.println("no hay bateria para moverse");
                return;
            }
            int consumo = (pasos / 100) * 10;
            if (bateria.getCarga() < consumo) {
                System.out.println("No hay suficiente bateria para moverse esa cantidad de pasos");
            } else {
                bateria.setCarga(bateria.getCarga() - consumo);
                System.out.println("El robot avanzo" + pasos + " pasos, consumio " + consumo + " de bateria");
            }
        }

        public void retroceder(int pasos) {
            if (dormido) {
                System.out.println("el robot esta dormido para retroceder");
                return;
            }


            if (bateria.getCarga() == 0) {
                System.out.println("no hay bateria para retroceder");
                return;
            }
            int consumo = (pasos / 100) * 10;

            if (bateria.getCarga() < consumo) {
                System.out.println("no hay suficiente bateria para retroceder");
            } else {
                bateria.setCarga(bateria.getCarga() - consumo);
                System.out.println("el robot retrocedio " + pasos + " pasos,consumio " + consumo + " de bateria");
            }
        }

        public void dormir() {
            dormido = true;
            System.out.println("el robot esta dormido");
        }



        public void despertar() {
            dormido = false;
            System.out.println("el robot esta despierto");
        }

        public void recargar() {
            bateria.setCarga(1000);
            System.out.println("la bateria de recargo con 1000");
        }
        public boolean bateriaLlena() {
            return bateria.getCarga() == 1000;
        }


        public boolean bateriaVacia() {
            return bateria.getCarga() == 0;
        }



        public int energiaActual() {
            return bateria.getCarga();
        }


        public boolean estaDormido() {
            return dormido;
        }



    @Override
    public String toString() {
        return "Robot{" +
                "bateria=" + bateria +
                ", dormido=" + dormido +
                '}';


    }
}




