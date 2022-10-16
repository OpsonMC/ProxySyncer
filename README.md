# ProxySyncer

## Goal

ProxySyncer has been created to sync Agones gameservers automatically with the Velocity proxy. This allows automatic
scaling to integrate perfectly with Velocity

## Requirements

- Java 17+
- Service account configured correctly so that the proxy can list gameservers

## Usage

- You can use the Gradle shadowJar task to create a fatJar out of the plugin
- Add your plugin to your Velocity plugin