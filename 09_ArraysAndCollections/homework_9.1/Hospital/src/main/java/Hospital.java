import net.sf.saxon.trans.SymbolicName;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatures = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            temperatures[i] = (float) ((Math.random() * (40 - 32)) + 32);
        }

        //TODO: напишите метод генерации массива температур пациентов

        return temperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        float sumTemperature = 0.0f;
        int healthyPatients = 0;
        String temperatures = "";
        for (float t: temperatureData) {
            sumTemperature += t;
            temperatures += String.format("%.1f",t) + " ";
            if (t >= 36.2f && t <= 36.9f) {
                healthyPatients++;
            }
        }

        String report =
                "Температуры пациентов: " + temperatures.trim() +
                        "\nСредняя температура: " + String.format("%.2f", sumTemperature / temperatureData.length) +
                        "\nКоличество здоровых: " + String.format("%d",healthyPatients);

        return report;
    }
}
