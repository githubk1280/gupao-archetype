## gupao 出品 springmvc archetype ##

## 自动生成项目框架，以下是操作步骤


### 本地操作

1. clone 本项目到本地
2. cd 到本项目下，运行 mvn install
3. cd 到你想要的目录下
4. 运行 mvn archetype:generate -DarchetypeCatalog=local 选择 gupao-archeypte的数字
   然后依次输入

   groupId

   artifactId

   version(注意version一定要保持一致)

   package（可以自定义）

5. 此步可不做，但是最好是做一下

   如果是 intelliJ 运行 mvn idea:idea

   如果是 Eclipse 运行 mvn eclipse:eclipse

### 发布到远程仓库操作

1. 发布

2. mvn archetype:generate -DarchetypeGroupId=com.gp -DarchetypeArtifactId=gupao-archetype -DarchetypeVersion=1.0-SNAPSHOT
