package isla;

public class Isla {
    private Ocupable[][] matriz;

    // Constructor de la isla con un tamaño específico
    public Isla(int filas, int columnas) {
        this.matriz = new Ocupable[filas][columnas];
    }

    // Método para poblar la isla con un objeto ocupable en una posición específica
    public void poblarIsla(Ocupable ocupable, int x, int y) {
        // Verificar si la posición está dentro de los límites
        if (x >= 0 && x < matriz.length && y >= 0 && y < matriz[0].length) {
            // Si la posición está ocupada, buscar otra posición aleatoria
            while (matriz[x][y] != null) {
                x = (int) (Math.random() * matriz.length);  // Nueva fila aleatoria
                y = (int) (Math.random() * matriz[0].length);  // Nueva columna aleatoria
            }
            // Asignar el ocupable a la posición encontrada
            matriz[x][y] = ocupable;
        } else {
            System.out.println("Posición fuera de los límites de la isla.");
        }
    }


    // Método para mostrar la matriz de la isla con caracteres Unicode
    public void mostrarIsla() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    // Si hay un objeto ocupable, se muestra un símbolo Unicode correspondiente al animal
                    String animal = matriz[i][j].getClass().getSimpleName();  // Obtiene el nombre de la clase del objeto
                    switch (animal) {
                        case "Aguila":
                            System.out.print("🦅");  //
                            break;
                        case "Boa":
                            System.out.print("🐍");  //
                            break;
                        case "Lobo":
                            System.out.print("🐺");  //
                            break;
                        case "Oso":
                            System.out.print("🐻");  //
                            break;
                        case "Zorro":
                            System.out.print("🦊");  //
                            break;
                        case "Bufalo":
                            System.out.print("🐃");  //
                            break;
                        case "Caballo":
                            System.out.print("🐎");  //
                            break;
                        case "Cabra":
                            System.out.print("🐐");  //
                            break;
                        case "Ciervo":
                            System.out.print("🦌");  //
                            break;
                        case "Conejo":
                            System.out.print("🐇");  //
                            break;
                        case "Jabali":
                            System.out.print("🐗");  //
                            break;
                        case "Oruga":
                            System.out.print("🐛");  //
                            break;
                        case "Oveja":
                            System.out.print("🐑");  //
                            break;
                        case "Pato":
                            System.out.print("🦆");  //
                            break;
                        case "Raton":
                            System.out.print("🐁");  //
                            break;
                        case "Planta":
                            System.out.print("🌱");  //
                            break;
                        default:
                            System.out.print("❓");  // Si el objeto es desconocido
                            break;
                    }
                } else {
                    System.out.print(" .");  // Representa un espacio vacío
                }
            }
            System.out.println();
        }
    }



    public void moverAnimal(Animal animal) {
        int x = animal.getPosicionX();
        int y = animal.getPosicionY();

        int[][] direcciones = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}, // Arriba, abajo, izquierda, derecha
                {-1, -1}, {-1, 1}, {1, -1}, {1, 1}  // Diagonales
        };

        boolean movido = false;

        for (int[] dir : direcciones) {
            int nuevoX = x + dir[0];
            int nuevoY = y + dir[1];

            if (nuevoX >= 0 && nuevoX < matriz.length && nuevoY >= 0 && nuevoY < matriz[0].length) {
                if (matriz[nuevoX][nuevoY] == null) {
                    matriz[nuevoX][nuevoY] = animal;
                    matriz[x][y] = null;
                    animal.setPosicionX(nuevoX);
                    animal.setPosicionY(nuevoY);
                    System.out.println(animal.getNombre() + " se movió a una nueva posición: (" + nuevoX + ", " + nuevoY + ").");
                    movido = true;
                    break;
                }
            }
        }

        if (!movido) {
            System.out.println("No hay posiciones disponibles cerca. El animal se queda en su lugar.");
        }
    }

    public void comer(Animal depredador) {
        int x = depredador.getPosicionX();
        int y = depredador.getPosicionY();
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        boolean haComido = false;

        for (int[] dir : direcciones) {
            int vecinoX = x + dir[0];
            int vecinoY = y + dir[1];
            if (vecinoX >= 0 && vecinoX < matriz.length && vecinoY >= 0 && vecinoY < matriz[0].length) {
                Ocupable vecino = matriz[vecinoX][vecinoY];

                if (vecino instanceof Animal) {
                    Animal presa = (Animal) vecino;

                    // Un herbívoro no puede comer animales
                    if (depredador instanceof Herbivoro) {
                        System.out.println(depredador.getNombre() + " es herbívoro y no puede comer animales.");
                        continue;
                    }

                    // Un carnívoro no puede comer plantas
                    if (depredador instanceof Carnivoro && !(presa instanceof Herbivoro)) {
                        System.out.println(depredador.getNombre() + " no puede comer a " + presa.getNombre());
                        continue;
                    }

                    // Consumir la presa
                    matriz[vecinoX][vecinoY] = null;
                    depredador.setEnergia(depredador.getEnergia() + presa.getEnergia());
                    System.out.println(depredador.getNombre() + " comió a " + presa.getNombre() + ". Energía actual: " + depredador.getEnergia());
                    haComido = true;
                    break;

                } else if (vecino instanceof Planta && depredador instanceof Herbivoro) {
                    // Herbívoros pueden comer plantas
                    matriz[vecinoX][vecinoY] = null;
                    depredador.setEnergia(depredador.getEnergia() + 10); // Energía ganada al comer una planta
                    System.out.println(depredador.getNombre() + " comió una planta. Energía actual: " + depredador.getEnergia());
                    haComido = true;
                    break;
                } else if (vecino instanceof Carnivoro && depredador instanceof Carnivoro) {
                    Animal otroAnimal = (Animal) vecino;
                    if (depredador instanceof Carnivoro && otroAnimal instanceof Carnivoro) {
                        // Pelea entre carnívoros
                        if (depredador.getEnergia() > otroAnimal.getEnergia()) {
                            matriz[vecinoX][vecinoY] = null; // Eliminar al carnívoro más débil
                            depredador.setEnergia(depredador.getEnergia() - otroAnimal.getEnergia() / 2); // Reducir algo de energía al ganador
                            System.out.println(depredador.getNombre() + " ganó la pelea contra " + otroAnimal.getNombre());
                        } else {
                            matriz[x][y] = null; // Eliminar al carnívoro más débil
                            otroAnimal.setEnergia(otroAnimal.getEnergia() - depredador.getEnergia() / 2); // Reducir algo de energía al ganador
                            System.out.println(otroAnimal.getNombre() + " ganó la pelea contra " + depredador.getNombre());
                            return; // El depredador fue eliminado
                        }
                        haComido = true;
                        break;
                    }
                }
            }
        }

        if (!haComido) {
            System.out.println(depredador.getNombre() + " no encontró comida y ha muerto.");
            matriz[x][y] = null; // Eliminar al depredador de la isla
        }
    }



}
