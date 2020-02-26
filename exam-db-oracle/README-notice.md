###注意点
oracle相关jar包没法通过mvn仓库下载，需要自己下载jar后，执行
eg：将下载好的ojdbc6.jar放在D盘：cmd命令先切换到D：
执行：mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar -Dfile=ojdbc6.jar