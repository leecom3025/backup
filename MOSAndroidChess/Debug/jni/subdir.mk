################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../jni/ChessBoard.cpp \
../jni/Game.cpp \
../jni/Move.cpp \
../jni/Pos.cpp \
../jni/chess-jni.cpp \
../jni/main.cpp 

OBJS += \
./jni/ChessBoard.o \
./jni/Game.o \
./jni/Move.o \
./jni/Pos.o \
./jni/chess-jni.o \
./jni/main.o 

CPP_DEPS += \
./jni/ChessBoard.d \
./jni/Game.d \
./jni/Move.d \
./jni/Pos.d \
./jni/chess-jni.d \
./jni/main.d 


# Each subdirectory must supply rules for building sources it contributes
jni/%.o: ../jni/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C++ Compiler'
	g++ -I/home/will/android-ndk-r10e/platforms/android-18/arch-x86/usr/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


