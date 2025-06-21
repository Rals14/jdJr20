public class Main {
    public static void main(String[] args) {
        Component developer1 = new Employees("Cristian", "Frontend developer");
        Component developer2 = new Employees("Andrei", "Backend developer");
        Component qa1 = new Employees("Alessandro", "QA");

        //Creamos un departamento de desarrollo
        Department developmentDepartment = new Department("Departamento de Desarrollo");
        developmentDepartment.add(developer1);
        developmentDepartment.add(developer2);

        // Creamos el departamento de QA

        Department qaDepartment = new Department("Departamento de QA");
        qaDepartment.add(qa1);

        // Creamos el departamento de IT
        Department itDepartment = new Department("Departamento de IT");
        itDepartment.add(developmentDepartment);
        itDepartment.add(qaDepartment);

        // Mostramos los detalles de los departamentos
        itDepartment.showDetails();
    }
}
