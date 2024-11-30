package org.example.mediaserver.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;
import org.xproce.lab.VideoServiceGrpc;


@GrpcService
public class VideoService extends VideoServiceGrpc.VideoServiceImplBase {

    @Override
    public void uploadVideo(UploadVideoRequest request, StreamObserver<Video>
            responseObserver) {
        Video video = Video.newBuilder().setId("123").build();
        responseObserver.onNext(video);
        responseObserver.onCompleted();
    }
}