package org.firstinspires.ftc.teamcode;

public class AutonOpMode {
    WebcamName webcamName = hardwareMap.get(WebcamName.class, "NAME_OF_CAMERA_IN_CONFIG_FILE");

    // Without a live preview
    OpenCvCamera camera = OpenCvCameraFactory.getInstance().createWebcam(webcamName);

    camera.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener()
    {
        @Override
        public void onOpened()
        {
            // Usually this is where you'll want to start streaming from the camera (see section 4)
        }
        @Override
        public void onError(int errorCode)
        {
            /*
             * This will be called if the camera could not be opened
             */
        }
    });


}
