package isp;

// No cumple con el Principio de Inversión de Dependencias
interface AnimalMalo {
    void eath();
    void fly(); // no aplica para todos
    void swim();// No aplica a todos
    void sleep();
}
