<img width="571" alt="Ekran Resmi 2024-12-12 17 37 12" src="https://github.com/user-attachments/assets/b86e7362-5625-4de8-806a-1baa1e9a7df9" />

# Modüller ve Rolleri

## **App Modülü**
- **Uygulamanın giriş noktasıdır**. `MainActivity` gibi framework bağımlı kodları barındırır.
- **UI bileşenlerini içerir** (Compose ekranları, navigasyon).
- **Bağımlılık**: Sadece `feature` modülüne bağımlıdır.

## **Feature Modülü**
- **Belirli bir özelliğe (feature) özel iş mantığını ve ekranları içerir**.
- **Bağımlılık**: `Domain` katmanındaki iş mantığına erişir.
- **Veri kaynaklarına erişim**: API çağrıları veya veritabanı gibi veri kaynaklarına erişim için `Domain` üzerinden `Data` modülüne ulaşır.

## **Domain Modülü**
- **İş kurallarını ve uygulamanın bağımsız mantığını içerir**.
- **En saf modül**: Hiçbir framework veya dış bağımlılığa sahip değildir.
- **İş mantığı**: `UseCase` sınıfları, iş kuralları ve uygulama mantığı burada bulunur.
- **Bağımlılık**: Sadece `Data` modülüne interface üzerinden erişir.

## **Data Modülü**
- **Veri kaynaklarının yönetiminden sorumludur**.
- **API çağrıları (Retrofit) ve veritabanı işlemleri (Room)** burada yapılır.
- **Bağımlılık**: `Domain` modülünde tanımlanan interface'leri implement eder.

