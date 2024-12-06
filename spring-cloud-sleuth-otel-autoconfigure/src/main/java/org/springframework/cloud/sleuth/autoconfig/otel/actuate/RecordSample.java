package org.springframework.cloud.sleuth.autoconfig.otel.actuate;

import java.util.List;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import io.opentelemetry.sdk.trace.samplers.SamplingResult;

/**
 * Created by wzhang. Date: 2024/12/5 Time: 19:38
 */
public class RecordSample implements Sampler {

	@Override
	public SamplingResult shouldSample(Context parentContext, String traceId, String name, SpanKind spanKind,
			Attributes attributes, List<LinkData> parentLinks) {
		return SamplingResult.create(SamplingDecision.RECORD_ONLY);
	}

	@Override
	public String getDescription() {
		return "RecordSample";
	}

}
