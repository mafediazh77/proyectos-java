$$$$


```bash
cd /home/segodimo/14java/proyectos-java/ejercicio_00/
```

#  OPTION 1 (COMPILE e RUN)
```bash
# COMPILE
javac -d bin app/Ejercicio_00.java       

# RUN
java -cp bin app/Ejercicio_00.java       
```

#  OPTION 2 (COMPILE e RUN)
```bash
# COMPILE
javac -d bin app/**/*.java

# RUN
java -cp bin app/**/*.java
```

# git
```bash
cd /home/segodimo/14java/proyectos-java/
git status
git add .
git status
git commit -m "ejercicio_00 start"
git status
git log

git pull
git push

git checkout nome-da-branch
git pull origin nome-da-branch
git fetch --all

# mudar de comentario no commit
git commit --amend
```


# ver version javac e java
javac -version
java -version


# .gitignore
ejercicio_00/bin/

