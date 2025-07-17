#!/bin/bash
# Variáveis
MDIRSRC="./br"
MFILEJAR="calculadora.jar"
# Início
echo "Log: Iniciando compilação."
rm -rf ./out
cd ./src
# Opção 1 - Todos os arquivos dentro da pasta "$MDIRSRC 
javac $MDIRSRC/**/*.java -d ../out --release 21
# Opção 2 - Todos os arquivos definidos manualmente (pasta-a-pasta)
#javac $MDIRSRC/calc/*.java -d ../out --release 21
#javac $MDIRSRC/main/*.java -d ../out --release 21
cd ..
echo "Log: Compilação concluída."
echo "Log: Criando JAR."
rm -rf ./artefact
cd ./out
# Opção 1 - Todos os arquivos dentro da pasta "$MDIRSRC 
jar -c -e br.main.Main --file ../artefact/$MFILEJAR $MDIRSRC/**/*.class 
# Opção 2 - Todos os arquivos definidos manualmente (pasta-a-pasta)
#jar -c -e br.main.Main --file ../artefact/$MFILEJAR $MDIRSRC/calc/*.class $MDIRSRC/main/*.class
cd ..
echo "Log: JAR criado."
echo "Log: Iniciando execução."
java -jar ./artefact/$MFILEJAR
echo "Log: Execução concluída."
