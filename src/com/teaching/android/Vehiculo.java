package com.teaching.android;

public class Vehiculo {
    private String matricula;
    private String color;
    private boolean reservado = false;
    private double precio;
}
public class Coche extends Vehiculo {
    private String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
        public Coche(String matricula); {
            this.matricula = matricula;
        }
        public class Moto extends Vehiculo {
            private String matricula;

            public Moto(String matricula) {
                this.matricula = matricula;
            }

            public class Vehiculo {
            }

            public class Coche extends Vehiculo {
                private String matricula;

                public Coche(String matricula) {
                    this.matricula = matricula;
                }
            }

            Coche ferrari = new Coche("");

            public String getMatricula() {
                return matricula;
            }

            Moto Motogp = new Moto("");

            public Moto getMotogp() {
                return Motogp;
            }
        }
    }
}