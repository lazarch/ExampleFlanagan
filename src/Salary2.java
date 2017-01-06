/** В следующем примере зарплата сотрудника успешно утраивается, так как в качестве параметра методу передается значение ссылки объекта.
 В качестве параметра используется значение ссылки на объект. При выполнении строки Salary s2 = new Salary(s1); конструктору Salary(Salary x) передастся значение ссылки на объект переменной s1, и конструктор фактически утроит зарплату для s1.value, поскольку даже копия (Salary x), создаваемая внутри конструктора указывает на объект переменной s1.*/
class Salary
{
    int value = 1000;
    Salary()
    {
    }
    Salary(Salary x)
    {
        x.value = x.value * 3;
    }
//    Salary(Salary x){this.value = this.value * 3;}
    public static void main(String args[])
    {
        Salary s1 = new Salary();
        System.out.println("primary s1.value =" +s1.value);

        Salary s2 = new Salary(s1);
        System.out.println("s1.value=" +s1.value);
        System.out.println("s2.value="+s2.value);
    }
}
/**В примере зарплата сотрудника успешно утраивается, так как в качестве параметра методу передается значение ссылки объекта.*/
