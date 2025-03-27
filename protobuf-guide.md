# Protocol Buffers (.proto) — Полное объяснение

Этот документ описывает структуру и смысл `.proto`-файлов, используемых в проекте SkyCalm для настройки gRPC-сервисов.

---

## Пример файла FlightAnalyzer.proto

```proto
syntax = "proto3";

package flightanalyzer;

option java_multiple_files = true;
option java_package = "com.skycalm.analyzer.grpc";
option java_outer_classname = "FlightAnalyzerProto";

service FlightAnalyzerService {
  rpc AnalyzeFlight (FlightRequest) returns (FlightResponse);
}

message FlightRequest {
  string flightNumber = 1;
  string departureDate = 2;
}

message FlightResponse {
  string routeSummary = 1;
  string turbulenceInfo = 2;
  string weatherInfo = 3;
}
```

---

## Построчное объяснение

### `syntax = "proto3";`
Указывает версию синтаксиса protobuf. `proto3` — последняя и основная.

### `package flightanalyzer;`
Это gRPC namespace, не связанный напрямую с Java. Используется для изоляции сервисов.

### `option java_package = "com.skycalm.analyzer.grpc";`
Путь в Java-проекте, куда будут помещены сгенерированные `.java`-классы.

### `option java_multiple_files = true;`
Генерирует каждый класс (`message`, `service`) в отдельный `.java`-файл (вместо одного большого).

### `option java_outer_classname = "FlightAnalyzerProto";`
Имя внешнего класса, если бы использовался режим одного файла. Для совместимости.

---

## Структура сообщений

### `message FlightRequest`
Это аналог Java DTO. Включает поля `flightNumber` и `departureDate`.

### `message FlightResponse`
Ответ от сервиса, содержащий сводку маршрута, информацию о турбулентности и погоде.

### Нумерация (`= 1`, `= 2`, …)
- Используется для бинарной сериализации.
- Не влияет на Java напрямую.
- Нельзя переиспользовать номера старых полей.

---

## Сервис

### `service FlightAnalyzerService`
Определяет gRPC-сервис с методом:

```proto
rpc AnalyzeFlight (FlightRequest) returns (FlightResponse);
```

Он будет сгенерирован как Java-интерфейс `FlightAnalyzerServiceGrpc` с методом, который ты реализуешь.

---

## Резюме

| Компонент         | Назначение                                  |
|------------------|----------------------------------------------|
| `syntax`         | Версия protobuf                              |
| `package`        | gRPC namespace                               |
| `option java_*`  | Настройки генерации Java-классов             |
| `message`        | Определение структуры данных (DTO)           |
| `= 1, 2, ...`     | Номера полей для сериализации                |
| `service` + `rpc`| Интерфейс gRPC и сигнатуры методов           |

---