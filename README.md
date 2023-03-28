# :triangular_flag_on_post: Aspect Oriented Programming (AOP)

<b>AOP, modüler bir programlama yaklaşımıdır ve bir programın farklı yerlerinde tekrar eden kod parçalarını bir araya getirir. AOP, bu tekrar eden kod parçalarının bir araya getirilmesi işlemini, birçok farklı özelliği veya ölçütü kullanarak gerçekleştirir.

Örneğin, bir web uygulamasında, kullanıcının kimliğini doğrulama kodu birçok farklı yerde tekrar edilebilir. Bu kod, her sayfa yüklenirken veya her veri kaydedildiğinde tekrarlanabilir. Bu durumda, AOP kullanarak doğrulama kodunu bir yerde tanımlayabilir ve uygulamanın farklı yerlerindeki tüm doğrulama ihtiyaçlarına uygulayabilirsiniz.

AOP ayrıca, bir programın farklı alanlarında, örneğin, veri erişimi, güvenlik veya günlükleme gibi tekrar eden kod parçalarını bir araya getirir ve bunları tek bir yerde yönetmenize olanak tanır. Bu, kod tekrarını azaltır, kodun okunabilirliğini arttırır ve bakım maliyetini düşürür.

Özetle, AOP, bir programın farklı yerlerinde tekrar eden kod parçalarını bir araya getirerek, kod tekrarını azaltır, kodun okunabilirliğini arttırır ve bakım maliyetini düşürür.</b>

## 🎯 Java AOP'de kullanılan anahtar kavramlar şunlardır:

1. **Joinpoint:** Bir programın çalışması sırasında, belirli bir anda (örneğin, bir metotun başlangıcında veya bir hata oluştuğunda) bulunulan nokta.
2. **Pointcut:** Bir veya daha fazla Joinpoint'i tanımlayan ifade. Bir Pointcut, programın farklı yerlerinde (örneğin, tüm metot çağrıları veya belirli bir paketteki tüm sınıflar) oluşan birçok Joinpoint'i tanımlayabilir.
3. **Advice:** Bir Pointcut için uygulanan eylem. AOP, Pointcut'ların tanımlandığı yerde ilgili kod parçalarını çalıştırmayı sağlar. Advice'lar, Pointcut'lar tarafından tanımlanan Joinpoint'lerde çalışır ve farklı türleri vardır:
    - **Before Advice:** Joinpoint'den önce çalışan kod parçası.
    - **After Advice:** Joinpoint'den sonra çalışan kod parçası.
    - **AfterReturning Advice:** Joinpoint'den sonra başarılı bir şekilde tamamlanan kod parçası.
    - **AfterThrowing Advice:** Joinpoint'den sonra bir istisna fırlatıldığında çalışan kod parçası.
    - **Around Advice:** Joinpoint'in etrafındaki kod parçası. Around Advice, Joinpoint'in öncesinde ve sonrasında çalışabilir ve Joinpoint'in kendisini değiştirebilir veya devre dışı bırakabilir.
4. **Aspect:** Pointcut'ları ve Advice'ları bir araya getiren bir yapı. Bir Aspect, uygulamanın farklı alanlarındaki birçok farklı Joinpoint'te çalışacak kod parçalarını içerir.


### :pushpin: Bağımlılıklar

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```