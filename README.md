# Тестирвание веб-сервиса "Путешествие дня"
Приложение — это веб-сервис, который предлагает купить тур по ценам двух способов:
1. Обычная оплата по дебетовой карте.
2. Выдача кредита по данным банковской карты.
## Документация
[Планировании автоматизации тестирования](https://github.com/JaneVolada/diplom/blob/main/docs/Plan.md)
[Отчётные документы по итогам тестирования](https://github.com/JaneVolada/diplom/blob/main/docs/Report.md)
[Отчётные документы по итогам автоматизации](https://github.com/JaneVolada/diplom/blob/main/docs/Summary.md)

## Начало работы
Перед началом работы удостоверьтесь, что у вас есть необходимый набор ПО, описанный в разделе Prerequisites. Для получения копии проекта необходимо клонировать репозиторий командой `git clone https://github.com/JaneVolada/diplom`
### Prerequisites
Для выполнения работы необходимо:
1. Установить [Google Chrome](https://www.google.ru/chrome/);
2. Установить  [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/download/#section=windows);
3. Установить [Github](https://desktop.github.com/);
4. Установить [Docker Desktop](https://www.docker.com/).
### Запуск тестов
1. Клонировать репозиторий командой `git clone https://github.com/JaneVolada/diplom`;
2. Открыть проект в IntelliJ IDEA;
3. Запустить MySQL, PostgreSQL, NodeJS через терминал командой: `docker-compose up`.
#### Для проверки MySQL:
1. В новой вкладке терминала запустить тестируемое приложение командой: `java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar artifacts/aqa-shop.jar`;
2. Убедиться в готовности системы. Приложение должно быть доступно по адресу: `http://localhost:8080/`;
3. В новой вкладке терминала запустить тесты командой: `.\gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app" `;
4. Для создания отчета запустить команду:`./gradlew allureServe`.
#### Для проверки PostgreSQL:
1. В новой вкладке терминала запустить тестируемое приложение командой: `java " java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar artifacts/aqa-shop.jar`;
2. Убедиться в готовности системы. Приложение должно быть доступно по адресу: `http://localhost:8080/`;
3. В новой вкладке терминала запустить тесты командой: `.\gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"
 `;
4. Для создания отчета запустить команду: `./gradlew allureServe`.

Для остановки приложений использовать команду `Cntrl C`. 

Для удаления контейнеров использовать команду `docker-compose down`
### Лицензия
1. Google Chrome - распространяется бесплатно;
2. IntelliJ IDEA Community Edition - распространяется бесплатно;
3. Github desktop - распространяется бесплатно;
4. Docker - распространяется бесплатно.
