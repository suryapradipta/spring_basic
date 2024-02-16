# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)


### Notes

# Inversion of Control
* IoC = prinsip pembuatan software dengan memindahkan kontrol untuk object/ program ke container di framework
* Container IoC melakukan execution program, manage object of the program, and do abstraction for application 
* Spring merupakan framework Inversion of Control

# Application Context
* Merupakan interface representasi container IoC di Spring
* Terbagi menjadi 2 jenis: XML dan Annotation
* Direkomendasikan menggunakan Annotation daripada XML sejak Spring 3

# Configuration
* Untuk membuat ApplicationContext menggunakan Annotation, perlu membuat Configuration Class menggunakan @Configuration

---

# Singleton
* Salah satu Design Pattern untuk pembuatan object, hanya dibuat 1 kali saja
* Ketika dibutuhkan kita menggunakan object yang sama
* Ini penting, ketika Spring membuat object, akan dibuat default Singleton

# Membuat Singleton
* Membuat class yang isi static method untuk membuat object dirinya sendiri 
* atau attributenya menggunakan static
* constructor dibuat private, sehingga user harus menggunakan method static ketika ingin membuat object

---
# Bean
* Object yang masuk ke dalam Spring Container IoC, merupakan Bean
* Bean merupakan singleton
* jika mengakses bean yang sama, maka akan mengembalikan object yang sama. 
* Bisa diubah menjadi tidak singleton

# Membuat Bean
* Membuat method di dalam class Configuration, kemudian nama method == nama bean, dan return object beannya
* Tambahkan annotation @Bean
* Secara otomatis spring mengeksekusi method tersebut, return value dijadikan object bean, dan disipan di container IoC

# Mengakses Bean
* Setelah membuat bean, automatically all object will managed by ApplicationContext
* access using getBean method from ApplicationContext

getBean(Foo.class) artinya mencari Bean yang data typenya Foo, 
ini mengembalikan object yang sama, karena ini merupakan singleton
bukan berarti method yang ada di dalam configuration yang di eksekusi, 
methodnya itu sebenaarnya dieksekusi di awal,
bahkan sebelum getbean dipanggil, itu sudah dipanggil methodnya

jadi dipanggil dulu method getBean, dimasukkan applicationContext, 
dipanggil atau tidak dipanggil, object getBean sudah ada di dalam Application Context

---
# Duplicate Bean
* Bisa mendaftarkan beberapa bean dengan type data yang sama, namun dengan nama bean yang berbeda
* saat mengakses bean, harus menggunakan nama beannya
* jika tidak spring akan bingung akses bean yang mana

# Primary Bean
* Jika terjadi duplicate bean, selain sebut nama ketika ingin mengakses bean, kita bisa pilih salah satu sebagai primary
* memilih salah satu menjadi primary, automatically can access bean without specifying the name bean
* automatically primary been is selected
* Gunakan annotation @Primary


aapa itu bean, kapan pakai bean, kapan tidak pakai bean

keanapa dinamakan bean kenapa nama lain bean

coffee bean
inti dari object

interaksi OOP yang penting itu adalah object


spring container == 

java itu programming language, spring itu adalah laravel

spring itu adalah laravel 

spring itu container, itu adalah menginteraksikan object2,

bean itu merupakan inti dari spring. 

object yang di manage di inversion of control adalah bean

kita bisa mendaftarkan bean untuk di manage oleh spring

kalo kita mau share object di beberapa tempat,
masukkan sebagai bean, kalo tidak perlu di share atau satu method,
kita tidak perlu dijadikan sebagai bean

bean itu artinya di manage oleh spring
dan di masukkan oleh container


di Java biasanya di control oleh class, namun disini kita menggunakan spring

java controll object di class

namun di spring, object itu kita serahkan ke container

kalo butuh kita di panggil pakai class, 

tinggal pakai (Foo.class)

application context tidak perlu dibuat, sudah dibuat oleh spring boot di main method, jadi ga perlu ambil app context


akun generator di generate graphql, kita third party pakai rest

pakai postman dulu, 

dari angular baru ambil spring rest nya 


spring merupakan container yang menginteraksikan object. jadi kita mendaftarkan bean untuk di manage oleh spring
Kalo kita mau share object di beberapa tempat, masukkan sebagai bean. Jika hanya digunakan 1 method atau tidak perlu di share, tidak perlu didaftarkan bean.
