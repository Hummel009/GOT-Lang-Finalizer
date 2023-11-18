Программа для отладки и дополнения файлов перевода в моём моде "Игра престолов" для Minecraft. Дописывает все непереведённые строчки (со знаком неравно) соответствующим английским текстом, чтобы переводчики могли переводить текст, никуда не заглядывая в поисках оригинала.

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA. Проконтролируйте, чтобы версии Gradle JVM и JDK соответствовали указанным ниже.

| Технология | Версия  | Пояснение                                    | Примечание                                                       |
|------------|---------|----------------------------------------------|------------------------------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки         | -                                                                |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle | [Настраивается в переменных средах ОС (JAVA_HOME и Path)][Link1] |
| Kotlin     | 1.9.20  | Версия Kotlin, используемая в проекте        | -                                                                |
| JDK        | 17.0.9  | Версия SDK, используемая в проекте           | [Настраивается в IntelliJ IDEA (Project Structure)][Link2]       |

[Link1]: https://java-lessons.ru/first-steps/java-home#:~:text=Теперь%20щёлкните%20правой%20кнопкой
[Link2]: https://www.jetbrains.com/help/idea/sdk.html#change-module-sdk

## Использование

Запустить скомпилированные jar-файлы двойным нажатием ЛКМ, либо открыть консоль Windows в папке с jar-файлом и выполнить команду `java -jar GOT-Lang-Finalizer.jar langUnfinalized.lang langFinalized.lang`. Откроется интуитивно понятный графический интерфейс.
