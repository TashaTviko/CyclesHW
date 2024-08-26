package ru.netology.javaqa.CyclesHW.services;

public class CalculateVacationService {
    public static int calculateMonthOfVacation(int income, int expenses, int threshold) {
        int vacation = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Решаем отдыхать
                money -= expenses; // Уменьшаем на обязательные траты
                money /= 3; // Уменьшаем остаток в три раза
                vacation++; // Увеличиваем счетчик месяцев отдыха
                money = money - expenses;
            } else {
                // Решаем работать
                money += income; // Увеличиваем баланс доходом
                money -= expenses; // Уменьшаем на обязательные траты
            }
        }
        return vacation;
    }
}
