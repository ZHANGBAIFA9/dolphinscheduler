# 介绍

其他模块使用引入依赖管理模块
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.afiab</groupId>
            <artifactId>dolphinscheduler-bom</artifactId>
            <version>${dolphinscheduler.version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
