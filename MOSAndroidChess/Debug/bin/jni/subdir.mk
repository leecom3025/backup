################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../bin/jni/ChessBoard.cpp \
../bin/jni/Game.cpp \
../bin/jni/Move.cpp \
../bin/jni/Pos.cpp \
../bin/jni/chess-jni.cpp \
../bin/jni/main.cpp 

OBJS += \
./bin/jni/ChessBoard.o \
./bin/jni/Game.o \
./bin/jni/Move.o \
./bin/jni/Pos.o \
./bin/jni/chess-jni.o \
./bin/jni/main.o 

CPP_DEPS += \
./bin/jni/ChessBoard.d \
./bin/jni/Game.d \
./bin/jni/Move.d \
./bin/jni/Pos.d \
./bin/jni/chess-jni.d \
./bin/jni/main.d 


# Each subdirectory must supply rules for building sources it contributes
bin/jni/%.o: ../bin/jni/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C++ Compiler'
	g++ -I/home/will/android-ndk-r10e/platforms/android-18/arch-x86/usr/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


