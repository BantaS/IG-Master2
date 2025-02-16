plugins {
  java
  id("org.springframework.boot") version "2.2.1.RELEASE"
  id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

tasks.bootJar {
  archiveName = "osm-boot.jar"
  manifest.attributes["Implementation-Version"] = project.version
}

dependencies {
  compile(project(":osm-core"))
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-configuration-processor:")
  implementation("org.springframework.boot:spring-boot-starter-cache")
  implementation("mil.nga.sf:sf-geojson:2.0.3")
  implementation("com.github.ben-manes.caffeine:caffeine:2.8.0")
}
