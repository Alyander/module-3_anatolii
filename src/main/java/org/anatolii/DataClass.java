package org.anatolii;

public class DataClass {
    /*static final Map<String, List<String>> question1s = new HashMap<>(
            Map.of(
                    "Ваш корабель \"Астрон\" заходить в орбіту планети X-9, але раптово починається магнітна буря. Що ви робитимете?", List.of("Вимкнути двигуни і чекати", "Використати протимагнітний екран", "Повертатися на Землю"),
                    "Ви оберете приземлення в пустелі і випадково запускаєте давній автоматичний сигнал. Вам необхідно відповісти на питання інопланетян.", List.of("Передати дружній сигнал.","Приховатися і зачекати","Запустити зброю"),
                    "Поруч із місцем посадки ви знаходите стародавні руїни. Вхід у них запечатаний. Що робити?", List.of("Вибити двері лазером.", "Аналізувати символи на вході і ввести правильний код.", "Залишити руїни і повернутися на корабель."),
                    "Усередині руїн ви знаходите світний артефакт. Він реагує на ваш дотик. Що робити?", List.of("Обережно забрати артефакт для вивчення.","Кинути його і тікати.","Спробувати зламати його оболонку."),
                    "Ваш корабель зазнав пошкоджень через невідомий енергетичний імпульс. Як ви будете діяти?", List.of("Полагодити енергосистему за допомогою запасних частин.", "Відправити сигнал лиха.", "Залишити корабель і шукати новий засіб пересування."),
                    "Під час дослідження лісу вас атакують місцеві хижаки. Як ви врятуєтесь?", List.of("Використати звуковий відлякувач.","Відкрити вогонь на ураження.","Залізти на дерево і чекати."),
                    "Ви зустрічаєте розумну расу, яка може допомогти вам. Як ви діятимете?", List.of("Почати переговори і встановити дружні відносини.","Викрасти їхню технологію.","Залишити їх у спокої і продовжити місію."),
                    "Місцеві жителі попереджають про глобальну катастрофу, яка насувається. Що ви зробите?", List.of("Знайти спосіб нейтралізувати загрозу.","Евакуювати свою команду.","Проігнорувати попередження."),
                    "Ви знаходите головний механізм, який може або врятувати планету, або знищити її. Ваш вибір?", List.of("Активувати механізм для порятунку.","Знищити механізм, не ризикуючи.","Не чіпати нічого і піти."),
                    "Ваш вибір врятував планету X-9! Місцеві жителі дякують вам, а ваша команда успішно повертається на Землю з безцінними знаннями. Ви стали героєм міжгалактичного масштабу!", List.of("Вирушити в нову експедицію.","Залишитися на планеті X-9 і розпочати нове життя.","Прийняти заслужену нагороду та подяку")

            )
    );*/

    public static final String[] questions = {
            "Ваш корабель \"Астрон\" заходить в орбіту планети X-9, але раптово починається магнітна буря. Що ви робитимете?",
            "Ви оберете приземлення в пустелі і випадково запускаєте давній автоматичний сигнал. Вам необхідно відповісти на питання інопланетян.",
            "Поруч із місцем посадки ви знаходите стародавні руїни. Вхід у них запечатаний. Що робити?",
            "Усередині руїн ви знаходите світний артефакт. Він реагує на ваш дотик. Що робити?",
            "Ваш корабель зазнав пошкоджень через невідомий енергетичний імпульс. Як ви будете діяти?",
            "Під час дослідження лісу вас атакують місцеві хижаки. Як ви врятуєтесь?",
            "Ви зустрічаєте розумну расу, яка може допомогти вам. Як ви діятимете?",
            "Місцеві жителі попереджають про глобальну катастрофу, яка насувається. Що ви зробите?",
            "Ви знаходите головний механізм, який може або врятувати планету, або знищити її. Ваш вибір?",
            "Ваш вибір врятував планету X-9! Місцеві жителі дякують вам, а ваша команда успішно повертається на Землю з безцінними знаннями. Ви стали героєм міжгалактичного масштабу!",
    };
    public static final String[][] answers = {
            {"Вимкнути двигуни і чекати", "Використати протимагнітний екран", "Повертатися на Землю"},
            {"Передати дружній сигнал.","Приховатися і зачекати","Запустити зброю"},
            {"Вибити двері лазером.", "Аналізувати символи на вході і ввести правильний код.", "Залишити руїни і повернутися на корабель."},
            {"Обережно забрати артефакт для вивчення.","Кинути його і тікати.","Спробувати зламати його оболонку."},
            {"Полагодити енергосистему за допомогою запасних частин.", "Відправити сигнал лиха.", "Залишити корабель і шукати новий засіб пересування."},
            {"Використати звуковий відлякувач.","Відкрити вогонь на ураження.","Залізти на дерево і чекати."},
            {"Почати переговори і встановити дружні відносини.","Викрасти їхню технологію.","Залишити їх у спокої і продовжити місію."},
            {"Знайти спосіб нейтралізувати загрозу.","Евакуювати свою команду.","Проігнорувати попередження."},
            {"Активувати механізм для порятунку.","Знищити механізм, не ризикуючи.","Не чіпати нічого і піти."},
            {"Вирушити в нову експедицію.","Залишитися на планеті X-9 і розпочати нове життя.","Прийняти заслужену нагороду та подяку"},
    };


    public static final String start = "Ви пілот космічного корабля, який разом з своєю командою вирушив до таємничої планети X-9. Ваше завдання - запобігти катастрофі і порятувати світ!";

    public static final Boolean[][] answersCorrections = new Boolean[][]{
            {false, true, false},
            {true, false, false},
            {false, true, false},
            {true, false, false},
            {true, false, false},
            {true, false, false},
            {true, false, false},
            {true, false, false},
            {true, false, false},
            {false, false, true}
    };
}
