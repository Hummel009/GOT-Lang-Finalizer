Программа для отладки и дополнения файлов перевода в моём моде "Игра престолов" для Minecraft. Дописывает все непереведённые строчки (со знаком неравно) соответствующим английским текстом, чтобы переводчики могли переводить текст, никуда не заглядывая в поисках оригинала.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA.

| Технология | Версия  | Пояснение                                    |
|------------|---------|----------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки         |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle |
| Kotlin     | 1.9.20  | Версия Kotlin, используемая в проекте        |
| JDK/SDK    | 17.0.9  | Версия Java, используемая в проекте          |

## Использование

Запустить скомпилированный jar-файл при помощи консоли Windows, либо вызовом из другой программы: `java -jar GOT-Lang-Finalizer.jar langUnfinalized.lang langFinalized.lang`.
